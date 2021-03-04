class Complex {
	private String name, skill, nl; 
   Complex(String name, String skill, String nl){
      this.name = name;
      this.skill = skill;
      this.nl = nl;
   }
   public boolean equals(Object obj) {
      if (obj == this) {
         return true;
      }
      if (!(obj instanceof Complex)) {
         return false;
      }
      Complex emp = (Complex) obj;
      return name.equals(emp.name)&& skill.equals(emp.skill)  && nl.equals(emp.nl);
   }
}

