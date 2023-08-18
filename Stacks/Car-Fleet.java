package Stacks;
import java.util.*;
class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        if(n==1) return 1;
        Stack<Double> stack = new Stack<>(); //stack to store the time of the cars to reach the destination
        int[][] car = new int[n][2]; //pair array consititng of {position of the car, speed of the car}
        for(int i=0;i<n;i++)
        {
            car[i][0]=position[i]; //initialising the position of the car
            car[i][1]=speed[i]; //initialising the speed of the car
        }
        Arrays.sort(car,java.util.Comparator.comparingInt(o->o[0])); //sorting the car based on their positions
        for(int i=car.length-1;i>=0;i--)
        {
            double currentTime = (double)(target-car[i][0])/car[i][1]; //calculating the time of the car to reach the target
            if(!stack.isEmpty() && currentTime<=stack.peek())  //check for a car fleet. if currenttime is less than the time on the top of the stac, then it will become a car fleet within themselves
                continue;
            else
                stack.push(currentTime); //push the current time of the car to the stack
        }
        return stack.size(); //the size of the stack with determine the number of car fleets


    }
}
