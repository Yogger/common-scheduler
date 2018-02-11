package com.windforce.common.scheduler;

/**
 * 计划任务触发条件值类型
 * @author Frank
 */
public enum ValueType {
	
	/** 直接为字符串表达式 */
	EXPRESSION,
	/** Bean名 */
	BEANNAME,
	/** Spring EL 表达式*/
	SPEL;
}
