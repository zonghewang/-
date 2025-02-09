package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service;
import java.util.List;

import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.OutgoingRecord;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.OutgoingRecordInfo;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.SalesOrder;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.SalesOrderInfo;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : StorehouseInOrOutService.java
//  @ Date : 2019/7/1 ����һ
//  @ Author : 
//
//



/**
 * 出入库服务层接口
 * @author Administrator
 *
 */
public interface IStorehouseInOrOutService extends IStorehouseService {
	/**
	 * 创建出入库和详单信息
	 * @param outgoing 出入库信息
	 * @param info 出入库详单信息
	 * @return 返回结果，true表示成功，false表示失败
	 */
	public Boolean createStorehouseInOrOutAndSetInfo(OutgoingRecord outgoing, Object info);
	/**
	 * 删除出入库和详单信息
	 * @param outgoing 出入库信息
	 * @param info 出入库详单信息
	 * @return 返回结果，true表示成功，false表示失败
	 */
	public Boolean deleteStorehouseInOrOutAndSetInfo(OutgoingRecord outgoing, Object info);
	/**
	 * 更新出入库和详单信息
	 * @param outgoing 出入库信息
	 * @param info 出入库详单信息
	 * @return 返回结果，true表示成功，false表示失败
	 */
	public Boolean updateStorehouseInOrOutAndSetInfo(OutgoingRecord outgoing, Object info);
	/**
	 * 获取出入库和详单信息通过名称
	 * @param outgoing 出入库信息
	 * @return 一个或多个出入库信息和信息详单
	 */
	public Object getStorehouseInOrOutAndSetInfoByName(OutgoingRecord outgoing);
	/**
	 * 获取出入库和详单信息通过id
	 * @param outgoing 出入库信息
	 * @return 一个出入库信息和信息详单
	 */
	public List<OutgoingRecordInfo> getStorehouseInOrOutAndSetInfoInById(OutgoingRecord outgoing);
	/**
	 * 获取全部出入库和详单信息
	 * @return 全部出入库信息和详单信息
	 */
	public Object getAllStorehouseInOrOut();
	/**
	 * 删除出入库的详单信息
	 * @param outgoing 出入库信息
	 * @param info 详细信息
	 * @return 返回结果，true表示成功，false表示失败
	 */
	public Boolean deleteStorehouseInOrOut(OutgoingRecord outgoing, Object info);
	/**
	 * 删除出入库信息
	 * @param outgoing 出入库信息
	 * @return 返回结果，true表示成功，false表示失败
	 */
	public Boolean deleteStorehouse(OutgoingRecord outgoing);
	/**
	 * 全部出入库
	 * @return
	 */
	public List<OutgoingRecord> OutgoingRecord();
	/**
	 * 删除通过infoid
	 * @param outgoingRecordInfo
	 * @return
	 */
	public boolean deleteOutgoingRecordInfoByInfoId(OutgoingRecordInfo outgoingRecordInfo);
	/**
	 * Orid 找本单
	 * @param salesOrder
	 * @return
	 */
	public OutgoingRecord getOutgoingRecordInfoByOrid(OutgoingRecord outgoingRecord);
	/**
	 * Orid 找详单
	 * @param outgoingRecord
	 * @return
	 */
	public List<OutgoingRecordInfo> getOutgoingAndInfoInfoByStorehouseByOrid(OutgoingRecord outgoingRecord);

	
}
