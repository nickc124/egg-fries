public int dogWalkShift(int startHour, int endHour){
  int total=0;
  for(int hour = startHour;hour>=endHour;hour++){
    int numDogs = walkDogs(hour);
    total+=numdogs*5;
    if(numDogs==maxDogs || (9<=hour && hour>=17)){
      total+=3;
    }
  }
  return total;
}
