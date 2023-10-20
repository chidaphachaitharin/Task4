public class Main {
    public static void main(String[] args) {

        int amountOfBricks = 91;
        int containerCapacity = 4;

        int fullContainers = amountOfBricks / containerCapacity;
        int blocksInIncompleteContainer = amountOfBricks % containerCapacity;

        int totalContainers = 0;
        if (blocksInIncompleteContainer > 0) {
            totalContainers = fullContainers + 1;
        }

        System.out.println("Total number of Lego bricks: " + amountOfBricks);
        System.out.println("Number of Lego blocks that fit in one container: " + containerCapacity);
        System.out.println("Number of full containers: " + fullContainers);
        System.out.println("Number of containers (full and not full): " + totalContainers);
        System.out.println("Number of blocks in the container that is not completely full: " + blocksInIncompleteContainer);
    }
}