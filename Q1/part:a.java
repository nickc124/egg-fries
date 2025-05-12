public int WalkDog(int Hour){
  int num = company.numAvailableDogs(hour);
  if(maxDog>=num){
      company.updateDogs(hour,num);
    return num;
  }else{
      company.updateDogs(hour,MaxDogs);
    return MaxDogs;
  }
}
