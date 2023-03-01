package com.demo.format;

import com.demo.ds.Report;
import com.demo.print.ReportPrinter;

public interface ReportFormatter {
    Report format(Report report);
}
