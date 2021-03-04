class Comp {
	private String name, skill, nat; 
   Comp(String name, String skill, String nat){
      this.name = name;
      this.skill = skill;
      this.nat = nat;
   }
   public boolean equals(Object o) {
      if (o == this) {
         return true;
      }
      if (!(o instanceof Comp)) {
         return false;
      }
      Comp emp = (Comp) o;
      return name.equals(emp.name)&& skill.equals(emp.skill)  && nat.equals(emp.nat);
   }
}

