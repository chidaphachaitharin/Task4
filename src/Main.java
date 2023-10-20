public class Main {
    public static void main(String[] args) {
        // Choose an odd number of Lego bricks between 50 and 100
        int amountOfBricks = 71; // You can change this value as needed
        // Choose an even number of Lego blocks that fit in one container between 5 and 10
        int containerCapacity = 8; // You can change this value as needed

        int fullContainers = amountOfBricks / containerCapacity;
        int blocksInIncompleteContainer = amountOfBricks % containerCapacity;
        int totalContainers = (blocksInIncompleteContainer > 0) ? fullContainers + 1 : fullContainers;

        System.out.println("Total number of Lego bricks: " + amountOfBricks);
        System.out.println("Number of Lego blocks that fit in one container: " + containerCapacity);
        System.out.println("Number of full containers: " + fullContainers);
        System.out.println("Number of containers (full and not full): " + totalContainers);
        System.out.println("Number of blocks in the container that is not completely full: " + blocksInIncompleteContainer);
    }
}