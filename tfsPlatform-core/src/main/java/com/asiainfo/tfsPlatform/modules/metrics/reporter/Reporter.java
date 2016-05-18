/*******************************************************************************
 * Copyright (c) 2005, 2014 springside.github.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package com.asiainfo.tfsPlatform.modules.metrics.reporter;

import java.util.Map;

import com.asiainfo.tfsPlatform.modules.metrics.Counter;
import com.asiainfo.tfsPlatform.modules.metrics.Gauge;
import com.asiainfo.tfsPlatform.modules.metrics.Histogram;
import com.asiainfo.tfsPlatform.modules.metrics.Timer;

/**
 * Reporter的公共接口，被ReportScheduler定时调用。
 * 
 * @author Calvin
 * 
 */
public interface Reporter {
	void report(Map<String, Gauge> gauges, Map<String, Counter> counters, Map<String, Histogram> histograms,
			Map<String, Timer> timers);
}
