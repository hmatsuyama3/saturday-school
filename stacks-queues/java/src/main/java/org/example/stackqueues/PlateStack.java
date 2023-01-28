package org.example.stackqueues;

public class PlateStack {

    private Object[] memory;
    private int stacksize;
    private PlateStack stack;

    public PlateStack(int capacity) {

        stack = new Object[capacity];
        stacksize = capacity;
        memory.add(stack); //add the stack to the memory array


    }

    public Object[] getBackingArrays() {
        return memory;
    }

    public void push(int value) {
        //need to place a check to see how many items are coming in
        //if over the stacksize capacity, start a new stack

        int counter = 0;
        if(counter<stacksize){
            stack.push(value); //add value to top of stackd
            counter++;
        }
        else if(counter==stacksize){
            stack = new Object[stacksize]; //not sure how to make new space in memory?
            stack.push(value); //add value to new stack
            memory.add(stack); //add stack to the memory array
            counter = 0; //reset counter
        }

    }

    private void increaseCapacity() {

    }

    public Object pop() {
        let index = memory.length-1;
        let isEmpty=true;
        while(isEmpty){ //look for first stack that is not empty
            if(memory[index].isEmpty()){
                index-=1;
                if(memory[index].isEmpty()){ //if current & next index are empty
                    memory.remove(index+1);  //remove the last element
                }
            }else{
                isEmpty=false;
            }
        }

        return memory[index].pop(); //pop from the last element in the memory array that isn't empty

    }

    private void decreaseCapacity() {

    }

    public int search(Object object) {
        let stacknum = memory.length-1;
        let counter = stacksize;
        for(int i=0; i<stacksize; i++){
            if(memory[stacknum].getStack(counter-1) == object){ 
                return i;
            }else{
                counter--;
            }

            if(counter == 0){
                stacknum--; //move to next stack
                counter = stacksize; //reset counter
            }
        }

        return -1;
    }

    public Object peek() {
        return memory[memory.length-1].peek(); //peek at the last stack
    }

    public Object popAt(int position) {
        return null;
    }
}
