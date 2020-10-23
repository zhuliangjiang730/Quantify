package com.zlj.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName StockMarkDataInfo
 * Package com.zlj.entity
 * Desc:
 *
 * @Date 2020/10/23 17:38
 * @autor zlj
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockMarkDataInfo {
    private double openPrice; //开盘价
    private double highPrice; //最高价
    private double lowPrice; //最低价
    private double closePrice; //收盘价
    private double turnoverVol; //成交量
    private double turnoverAmt; //成交额
    private double handTurnoveRate; //换手率
    private double circulationMarketValue; //流通市值
    private double PERatio; //市盈率
    private String dataType; //数据类型：1-1分钟数据，2-5分钟数据，3-15分钟数据，4-30分钟数据，5-一小时数据，6-日数据、7-周数据，8-月数据，9-季数据，10-年数据，
}