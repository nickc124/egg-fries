public int WalkDog(int Hour){
  int num = company.numAvailableDogs();
  if(MaxDog>=num){
      company.updateDogs(hour,num);
  }else{
      company.updateDogs(hour,MaxDogs);
  }
}
