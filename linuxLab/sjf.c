#include <stdio.h>
#include <stdlib.h>


typedef struct {
    int id;               
    int arrival_time;     
    int burst_time;       
    int waiting_time;     
    int turn_around_time; 
    int completion_time;  
} Process;


int compareBurstTime(const void *a, const void *b) {
    return ((Process*)a)->burst_time - ((Process*)b)->burst_time;
}


void calculateCompletionTime(Process *processes, int n) {
    int current_time = 0;
    for (int i = 0; i < n; i++) {
        processes[i].completion_time = current_time + processes[i].burst_time;
        current_time = processes[i].completion_time; // Update current time after each process
    }
}


void calculateWaitingTime(Process *processes, int n) {
    processes[0].waiting_time = 0; 


    for (int i = 1; i < n; i++) {
        processes[i].waiting_time = processes[i - 1].completion_time;
    }
}


void calculateTurnAroundTime(Process *processes, int n) {
    for (int i = 0; i < n; i++) {

        processes[i].turn_around_time = processes[i].waiting_time + processes[i].burst_time;
    }
}


float calculateThroughput(Process *processes, int n) {

    int max_completion_time = processes[0].completion_time;
    for (int i = 1; i < n; i++) {
        if (processes[i].completion_time > max_completion_time) {
            max_completion_time = processes[i].completion_time;
        }
    }


    return (float)n / max_completion_time;
}


void printResults(Process *processes, int n) {
    printf("Process ID | Arrival Time | Burst Time | Waiting Time | Turnaround Time | Completion Time\n");
    float total_waiting_time = 0, total_turnaround_time = 0;

    for (int i = 0; i < n; i++) {
        printf("%9d | %12d | %10d | %12d | %15d | %15d\n", processes[i].id, processes[i].arrival_time, processes[i].burst_time,
               processes[i].waiting_time, processes[i].turn_around_time, processes[i].completion_time);
        total_waiting_time += processes[i].waiting_time;
        total_turnaround_time += processes[i].turn_around_time;
    }


    printf("Average Waiting Time: %.2f\n", total_waiting_time / n);
    printf("Average Turnaround Time: %.2f\n", total_turnaround_time / n);


    float throughput = calculateThroughput(processes, n);
    printf("Throughput: %.2f processes per unit time\n", throughput);
}

int main() {
    int n;


    printf("Enter number of processes: ");
    scanf("%d", &n);


    Process *processes = (Process *)malloc(n * sizeof(Process));

 
    for (int i = 0; i < n; i++) {
        processes[i].id = i + 1;  // Assign process ID
        processes[i].arrival_time = 0;  // All processes have arrival time = 0
        printf("Enter burst time for process %d: ", i + 1);
        scanf("%d", &processes[i].burst_time);
    }


    qsort(processes, n, sizeof(Process), compareBurstTime);


    calculateCompletionTime(processes, n);
    calculateWaitingTime(processes, n);
    calculateTurnAroundTime(processes, n);


    printResults(processes, n);


    free(processes);

    return 0;
}
