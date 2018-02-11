package com.windforce.common.scheduler;

/**
 * 计划任务触发条件值类型
 * @author Frank
 */
public enum ScheduledType {
	
	/** 直接为字符串表达式 */
	EXPRESSION,
	/** 属性名 */
	FIELD_NAME;
}
