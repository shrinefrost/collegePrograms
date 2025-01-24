#include <stdio.h>
#include <fcntl.h>   // For open() flags
#include <unistd.h>  // For read(), write(), close(), unlink()
#include <string.h>  // For strlen()

int main() {
    int fd;
    ssize_t bytes_written, bytes_read;
    char buffer[100];  // Buffer to store the data read from the file
    const char *data = "Hello, this is a test of Linux system calls!\n";

    // 1. Open the file for writing (create if it doesn't exist)
    fd = open("testfile.txt", O_WRONLY | O_CREAT | O_TRUNC, 0644);
    if (fd == -1) {
        perror("Error opening file for writing");
        return 1;
    }
    printf("File opened for writing.\n");

    // 2. Write data to the file
    bytes_written = write(fd, data, strlen(data));
    if (bytes_written == -1) {
        perror("Error writing to file");
        close(fd);  // Close the file before exiting
        return 1;
    }
    printf("Data written to file: %s", data);

    // 3. Close the file after writing
    close(fd);
    printf("File closed after writing.\n");

    // 4. Open the file for reading
    fd = open("testfile.txt", O_RDONLY);
    if (fd == -1) {
        perror("Error opening file for reading");
        return 1;
    }
    printf("File opened for reading.\n");

    // 5. Read data from the file
    bytes_read = read(fd, buffer, sizeof(buffer) - 1);  // Leave space for null terminator
    if (bytes_read == -1) {
        perror("Error reading from file");
        close(fd);  // Close the file before exiting
        return 1;
    }

    buffer[bytes_read] = '\0';  // Null terminate the string
    printf("Data read from file: %s", buffer);

    // 6. Close the file after reading
    close(fd);
    printf("File closed after reading.\n");

    // 7. Delete the file using unlink
    if (unlink("testfile.txt") == -1) {
        perror("Error deleting the file");
        return 1;
    }
    printf("File deleted successfully.\n");

    return 0;
}
