package com.bdqn.dao.mapper;
import java.util.List;
import java.util.Map;
/**
 * 
 * @ClassName:  UserMapper   
 * @Description:
 * @author: caijiankai 
 * @date:   2018年8月18日 下午3:44:55   
 *     
 * @Copyright: 2018  
 * 注意：本内容仅限于本公司内部传阅，禁止外泄以及用于其他的商业目
 */
public interface UserMapper {
	/**
	 * 检查登录
	 * @param params
	 * @return
	 */
	public Map<String,Object> checkLogin(Map<String,Object> params);
	/**
	 * 修改密码
	 * @param params
	 */
	public void updateUserPass(Map<String, String> params);
	
	/**
	 * 用户列表
	 * @param params
	 * @return
	 */
	public List<Map<String,Object>> userList(Map<String,Object> params);
	/**
	 * 用户总条数
	 * @param params
	 * @return
	 */
	public int userListCount(Map<String,Object> params);

}