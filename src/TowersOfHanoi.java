public class TowersOfHanoi {


    // Recursive function to solve the Towers of Hanoi puzzle
    public static void solveTowersOfHanoi(int n, char fromRod, char toRod, char auxRod) {
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + fromRod + " to rod " + toRod);
            return;
        }
        solveTowersOfHanoi(n - 1, fromRod, auxRod, toRod);
        System.out.println("Move disk " + n + " from rod " + fromRod + " to rod " + toRod);
        solveTowersOfHanoi(n - 1, auxRod, toRod, fromRod);
    }

    public static void main(String[] args) {
        int n = 3; // Number of disks
        solveTowersOfHanoi(n, 'A', 'C', 'B'); // A, B and C are names of rods
    }
}


