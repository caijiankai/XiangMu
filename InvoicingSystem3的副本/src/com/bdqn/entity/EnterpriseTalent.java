/**
 * 
 */
package com.bdqn.entity;

/**
 * @author:caijiankai
 *@date: 2018年9月15日 下午1:34:30
 *@Copyright: 2018
 *注意:本内容严格保密,禁止外泄或私自用于商业用途
 *
 */
public class EnterpriseTalent {
		//人才编号
		int id;
		//人才姓名
		String name;
		//工作年限
		int workingLife;
		//工作经历
		String workExperience;
		//个人简介
		String personalProfile;
		//所属部门
		int departmentId;
		//毕业院校
		String graduateSchool;
		
		
		/**
		 * @return the id
		 */
		public int getId() {
			return id;
		}
		/**
		 * @param id the id to set
		 */
		public void setId(int id) {
			this.id = id;
		}
		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}
		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}
		/**
		 * @return the workingLife
		 */
		public int getWorkingLife() {
			return workingLife;
		}
		/**
		 * @param workingLife the workingLife to set
		 */
		public void setWorkingLife(int workingLife) {
			this.workingLife = workingLife;
		}
		/**
		 * @return the workExperience
		 */
		public String getWorkExperience() {
			return workExperience;
		}
		/**
		 * @param workExperience the workExperience to set
		 */
		public void setWorkExperience(String workExperience) {
			this.workExperience = workExperience;
		}
		/**
		 * @return the personalProfile
		 */
		public String getPersonalProfile() {
			return personalProfile;
		}
		/**
		 * @param personalProfile the personalProfile to set
		 */
		public void setPersonalProfile(String personalProfile) {
			this.personalProfile = personalProfile;
		}
		/**
		 * @return the departmentId
		 */
		public int getDepartmentId() {
			return departmentId;
		}
		/**
		 * @param departmentId the departmentId to set
		 */
		public void setDepartmentId(int departmentId) {
			this.departmentId = departmentId;
		}
		/**
		 * @return the graduateSchool
		 */
		public String getGraduateSchool() {
			return graduateSchool;
		}
		/**
		 * @param graduateSchool the graduateSchool to set
		 */
		public void setGraduateSchool(String graduateSchool) {
			this.graduateSchool = graduateSchool;
		}
		
}
