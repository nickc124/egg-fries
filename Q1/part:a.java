public int WalkDog(int Hour){
  int num = company.numAvailableDogs();
  if(MaxDog>=num){
      company.updateDogs(hour,num);
    return num;
  }else{
      company.updateDogs(hour,MaxDogs);
    return MaxDogs;
  }
}
