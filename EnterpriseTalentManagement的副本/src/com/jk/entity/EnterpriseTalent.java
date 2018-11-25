package com.jk.entity;


public class EnterpriseTalent {

   int id;
   String name;
   int workingLife;
   String workExperience;
   String personalProfile;
   int departmentId;
   String graduateSchool;


   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getWorkingLife() {
      return this.workingLife;
   }

   public void setWorkingLife(int workingLife) {
      this.workingLife = workingLife;
   }

   public String getWorkExperience() {
      return this.workExperience;
   }

   public void setWorkExperience(String workExperience) {
      this.workExperience = workExperience;
   }

   public String getPersonalProfile() {
      return this.personalProfile;
   }

   public void setPersonalProfile(String personalProfile) {
      this.personalProfile = personalProfile;
   }

   public int getDepartmentId() {
      return this.departmentId;
   }

   public void setDepartmentId(int departmentId) {
      this.departmentId = departmentId;
   }

   public String getGraduateSchool() {
      return this.graduateSchool;
   }

   public void setGraduateSchool(String graduateSchool) {
      this.graduateSchool = graduateSchool;
   }
}
