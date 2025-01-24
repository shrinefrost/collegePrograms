#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <stdlib.h>
#include <signal.h>

int main() {
    pid_t pid;

    // Create a new child process using fork()
    pid = fork();

    if (pid == -1) {
        // Handle fork failure
        perror("fork failed");
        return 1;
    } else if (pid == 0) {
        // This block will be executed by the child process
        printf("Child process: PID = %d\n", getpid());

        // Replace the child process with the 'ls' command using exec()
        printf("Child process: Executing 'ls -l' using exec()\n");
        execl("/bin/ls", "ls", "-l", (char *)NULL);

        // If execl() fails, print an error (it will not return if successful)
        perror("exec failed");
        return 1;
    } else {
        // This block will be executed by the parent process
        printf("Parent process: PID = %d, Child PID = %d\n", getpid(), pid);

        // Wait for the child process to finish using wait()
        int status;
        waitpid(pid, &status, 0);

        if (WIFEXITED(status)) {
            printf("Parent process: Child exited with status %d\n", WEXITSTATUS(status));
        } else {
            printf("Parent process: Child process did not exit normally.\n");
        }


        return 0;
    }
}
