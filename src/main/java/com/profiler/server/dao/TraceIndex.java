package com.profiler.server.dao;

import com.profiler.common.dto.thrift.Span;

public interface TraceIndex {
	void insert(Span span);
}
