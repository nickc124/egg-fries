public Round(String[] names){
  compatitorList = new ArrayList<Competitor>();
  for(int i=0;i<names.length;i++){
    Competitor temp = new Competitor(names[i],i+1);
    compatitorList.add(temp);
  }
}
