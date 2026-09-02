package package9;
import java.util.*;
class Meeting {
    String name;
    int start;
    int end;

    public Meeting(String name, int start, int end) {
        this.name = name;
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return name + " (" + start + " - " + end + ")";
    }
}

public class intmerge {
    public static void main(String[] args) {
        // 1. Create PriorityQueue sorted by meeting start time
        PriorityQueue<Meeting> pq = new PriorityQueue<>(Comparator.comparingInt(m -> m.start));

        // 2. Add your A-E values here
        pq.add(new Meeting("A", 900, 1030));
        pq.add(new Meeting("B", 1000, 1100)); // Overlaps A
        pq.add(new Meeting("C", 1130, 1230));
        pq.add(new Meeting("D", 1200, 1330)); // Overlaps C
        pq.add(new Meeting("E", 1400, 1500));

        // 3. Internal Merge Logic using a secondary tracking queue
        PriorityQueue<Meeting> mergedQueue = new PriorityQueue<>(Comparator.comparingInt(m -> m.start));

        while (!pq.isEmpty()) {
            Meeting current = pq.poll();

            // If merged list is empty or no overlap, add directly
            if (mergedQueue.isEmpty() || current.start > peekLast(mergedQueue).end) {
                mergedQueue.add(current);
            } else {
                // Internal merge: update existing meeting's end time
                Meeting existing = peekLast(mergedQueue);
                existing.end = Math.max(existing.end, current.end);
                existing.name += "+" + current.name;
            }
        }

        // 4. Print results
        System.out.println("--- Merged Schedule ---");
        while (!mergedQueue.isEmpty()) {
            System.out.println(mergedQueue.poll());
        }
    }

    // Helper method to look at the last element added to a priority queue without removing it
    private static Meeting peekLast(PriorityQueue<Meeting> queue) {
        return (Meeting) queue.toArray()[queue.size() - 1];
    }
}
