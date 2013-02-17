package com.founder.fix.fixflow.core.objkey;



public class ProcessInstanceObjKey {

	
	/**
	 * 编号
	 * @return
	 */
	public static FlowKeyProcessInstanceId ProcessInstanceId(){
		return new ProcessInstanceObjKey().new FlowKeyProcessInstanceId();
	}
	
	public class FlowKeyProcessInstanceId implements ObjKeyInterface{


		public String EntityKey() {
			// TODO Auto-generated method stub
			return "id";
		}

		public String DataBaseKey() {
			// TODO Auto-generated method stub
			return "PROCESSINSTANCE_ID";
		}
		
		public String FullKey() {
			// TODO Auto-generated method stub
			return "processInstanceId";
		}

		public String KeyName() {
			// TODO Auto-generated method stub
			return "编号";
		}

	}
	
	
	/**
	 * 编号
	 * @return
	 */
	public static FlowKeyProcessLocation ProcessLocation(){
		return new ProcessInstanceObjKey().new FlowKeyProcessLocation();
	}
	
	public class FlowKeyProcessLocation implements ObjKeyInterface{


		public String EntityKey() {
			// TODO Auto-generated method stub
			return "processLocation";
		}

		public String DataBaseKey() {
			// TODO Auto-generated method stub
			return "PROCESSLOCATION";
		}
		
		public String FullKey() {
			// TODO Auto-generated method stub
			return "processLocation";
		}

		public String KeyName() {
			// TODO Auto-generated method stub
			return "流程位置";
		}

	}
	
	
	
	
	
	/**
	 * 流程定义唯一编号
	 * @return
	 */
	public static FlowKeyProcessDefinitionId ProcessDefinitionId(){
		return new ProcessInstanceObjKey().new FlowKeyProcessDefinitionId();
	}
	
	public class FlowKeyProcessDefinitionId implements ObjKeyInterface{


		public String EntityKey() {
			// TODO Auto-generated method stub
			return "processDefinitionId";
		}

		public String DataBaseKey() {
			// TODO Auto-generated method stub
			return "PROCESSDEFINITION_ID";
		}
		
		public String FullKey() {
			// TODO Auto-generated method stub
			return "processDefinitionId";
		}

		public String KeyName() {
			// TODO Auto-generated method stub
			return "流程定义唯一编号";
		}

	}

	
	
	
	
	
	/**
	 * 流程实例主题
	 * @return
	 */
	public static FlowKeySubject Subject(){
		return new ProcessInstanceObjKey().new FlowKeySubject();
	}
	
	public class FlowKeySubject implements ObjKeyInterface{


		public String EntityKey() {
			// TODO Auto-generated method stub
			return "subject";
		}

		public String DataBaseKey() {
			// TODO Auto-generated method stub
			return "SUBJECT";
		}
		
		public String FullKey() {
			// TODO Auto-generated method stub
			return "subject";
		}

		public String KeyName() {
			// TODO Auto-generated method stub
			return "流程实例主题";
		}

	}

	
	
	
	/**
	 * 启动时间
	 * @return
	 */
	public static FlowKeyStartTime StartTime(){
		return new ProcessInstanceObjKey().new FlowKeyStartTime();
	}
	
	public class FlowKeyStartTime implements ObjKeyInterface{


		public String EntityKey() {
			// TODO Auto-generated method stub
			return "startTime";
		}

		public String DataBaseKey() {
			// TODO Auto-generated method stub
			return "START_TIME";
		}
		
		public String FullKey() {
			// TODO Auto-generated method stub
			return "startTime";
		}

		public String KeyName() {
			// TODO Auto-generated method stub
			return "启动时间";
		}

	}
	
	
	
	
	/**
	 * 结束时间
	 * @return
	 */
	public static FlowKeyEndTime EndTime(){
		return new ProcessInstanceObjKey().new FlowKeyEndTime();
	}
	
	public class FlowKeyEndTime implements ObjKeyInterface{


		public String EntityKey() {
			// TODO Auto-generated method stub
			return "endTime";
		}

		public String DataBaseKey() {
			// TODO Auto-generated method stub
			return "END_TIME";
		}
		
		public String FullKey() {
			// TODO Auto-generated method stub
			return "endTime";
		}

		public String KeyName() {
			// TODO Auto-generated method stub
			return "结束时间";
		}

	}
	
	
	
	/**
	 * 业务定义编号
	 * @return
	 */
	public static FlowKeyDefinitionId DefinitionId(){
		return new ProcessInstanceObjKey().new FlowKeyDefinitionId();
	}
	
	public class FlowKeyDefinitionId implements ObjKeyInterface{


		public String EntityKey() {
			// TODO Auto-generated method stub
			return "definitionId";
		}

		public String DataBaseKey() {
			// TODO Auto-generated method stub
			return "DEFINITION_ID";
		}
		
		public String FullKey() {
			// TODO Auto-generated method stub
			return "definitionId";
		}

		public String KeyName() {
			// TODO Auto-generated method stub
			return "业务定义编号";
		}

	}
	
	
	
	

	/**
	 * 根令牌编号
	 * @return
	 */
	public static FlowKeyRootTokenId RootTokenId(){
		return new ProcessInstanceObjKey().new FlowKeyRootTokenId();
	}
	
	public class FlowKeyRootTokenId implements ObjKeyInterface{


		public String EntityKey() {
			// TODO Auto-generated method stub
			return "rootTokenId";
		}

		public String DataBaseKey() {
			// TODO Auto-generated method stub
			return "ROOTTOKEN_ID";
		}
		
		public String FullKey() {
			// TODO Auto-generated method stub
			return "rootTokenId";
		}

		public String KeyName() {
			// TODO Auto-generated method stub
			return "根令牌编号";
		}

	}
	
	
	
	
	/**
	 * 业务关联键值
	 * @return
	 */
	public static FlowKeyBizKey BizKey(){
		return new ProcessInstanceObjKey().new FlowKeyBizKey();
	}
	
	public class FlowKeyBizKey implements ObjKeyInterface{


		public String EntityKey() {
			// TODO Auto-generated method stub
			return "bizKey";
		}

		public String DataBaseKey() {
			// TODO Auto-generated method stub
			return "BIZ_KEY";
		}
		
		public String FullKey() {
			// TODO Auto-generated method stub
			return "bizKey";
		}

		public String KeyName() {
			// TODO Auto-generated method stub
			return "业务关联键值";
		}

	}
	
	
	
	/**
	 * 提交人
	 * @return
	 */
	public static FlowKeyInitiator Initiator(){
		return new ProcessInstanceObjKey().new FlowKeyInitiator();
	}
	
	public class FlowKeyInitiator implements ObjKeyInterface{


		public String EntityKey() {
			// TODO Auto-generated method stub
			return "initiator";
		}

		public String DataBaseKey() {
			// TODO Auto-generated method stub
			return "INITIATOR";
		}
		
		public String FullKey() {
			// TODO Auto-generated method stub
			return "initiator";
		}

		public String KeyName() {
			// TODO Auto-generated method stub
			return "提交人";
		}

	}
	
	
	/**
	 * 启动人
	 * @return
	 */
	public static FlowKeyStartAuthor StartAuthor(){
		return new ProcessInstanceObjKey().new FlowKeyStartAuthor();
	}
	
	public class FlowKeyStartAuthor implements ObjKeyInterface{


		public String EntityKey() {
			// TODO Auto-generated method stub
			return "startAuthor";
		}

		public String DataBaseKey() {
			// TODO Auto-generated method stub
			return "START_AUTHOR";
		}
		
		public String FullKey() {
			// TODO Auto-generated method stub
			return "startAuthor";
		}

		public String KeyName() {
			// TODO Auto-generated method stub
			return "启动人";
		}

	}
	
	
	
	/**
	 * 是否暂停
	 * @return
	 */
	public  static FlowKeyIsSuspended IsSuspended(){
		return new ProcessInstanceObjKey().new FlowKeyIsSuspended();
	}
	
	public class FlowKeyIsSuspended implements ObjKeyInterface{


		public String EntityKey() {
			// TODO Auto-generated method stub
			return "isSuspended";
		}

		public String DataBaseKey() {
			// TODO Auto-generated method stub
			return "ISSUSPENDED";
		}
		
		public String FullKey() {
			// TODO Auto-generated method stub
			return "isSuspended";
		}

		public String KeyName() {
			// TODO Auto-generated method stub
			return "是否暂停";
		}

	}
	
	
	
	/**
	 * 流程定义编号
	 * @return
	 */
	public  static FlowKeyProcessDefinitionKey ProcessDefinitionKey(){
		return new ProcessInstanceObjKey().new FlowKeyProcessDefinitionKey();
	}
	
	public class FlowKeyProcessDefinitionKey implements ObjKeyInterface{


		public String EntityKey() {
			// TODO Auto-generated method stub
			return "processDefinitionKey";
		}

		public String DataBaseKey() {
			// TODO Auto-generated method stub
			return "PROCESSDEFINITION_KEY";
		}
		
		public String FullKey() {
			// TODO Auto-generated method stub
			return "processDefinitionKey";
		}

		public String KeyName() {
			// TODO Auto-generated method stub
			return "流程定义编号";
		}

	}
	
	
	
	/**
	 * 父流程实例编号
	 * @return
	 */
	public  static FlowKeyParentProcessInstanceId ParentProcessInstanceId(){
		return new ProcessInstanceObjKey().new FlowKeyParentProcessInstanceId();
	}
	
	public class FlowKeyParentProcessInstanceId implements ObjKeyInterface{


		public String EntityKey() {
			// TODO Auto-generated method stub
			return "parentProcessInstanceId";
		}

		public String DataBaseKey() {
			// TODO Auto-generated method stub
			return "PARENT_INSTANCE_ID";
		}
		
		public String FullKey() {
			// TODO Auto-generated method stub
			return "parentProcessInstanceId";
		}

		public String KeyName() {
			// TODO Auto-generated method stub
			return "父流程实例编号";
		}

	}
	
	
	
	
	/**
	 * 父流程实例令牌编号
	 * @return
	 */
	public static FlowKeyParentProcessInstanceTokenId ParentProcessInstanceTokenId(){
		return new ProcessInstanceObjKey().new FlowKeyParentProcessInstanceTokenId();
	}
	
	public class FlowKeyParentProcessInstanceTokenId implements ObjKeyInterface{


		public String EntityKey() {
			// TODO Auto-generated method stub
			return "parentProcessInstanceTokenId";
		}

		public String DataBaseKey() {
			// TODO Auto-generated method stub
			return "PARENT_INSTANCE_TOKEN_ID";
		}
		
		public String FullKey() {
			// TODO Auto-generated method stub
			return "parentProcessInstanceTokenId";
		}

		public String KeyName() {
			// TODO Auto-generated method stub
			return "父流程实例令牌编号";
		}

	}
	
	
}