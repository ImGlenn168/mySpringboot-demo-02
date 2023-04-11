package com.java.myspringbootdemo02.Api.result;

import lombok.Data;

import java.util.List;

@Data
public class Page<T> {
    // 每页条数
    private int pageSize;
    // 当前页
    private int currentPage;
    // 总数据量
    private int total;
    // 总页数
    private int totalPages;
    // 当前页
    private int preNum;
    // 下一页
    private int nextNum;
    // 当前首页
    private int startNavNum;
    // 当前尾页
    private int endNavNum;

    // 具体数据
    private List<T> records;

    public Page() {
    }

    public Page(int pageSize, int currentPage, int total, List<T> records) {
        this.pageSize = pageSize;
        this.currentPage = currentPage;
        this.total = total;
        this.records = records;

        this.totalPages = (int) Math.ceil(total / (pageSize * 1.0));

        this.preNum = Math.max(currentPage - 1, 1);
        this.nextNum = currentPage + 1 > totalPages ? total : currentPage + 1;

        this.startNavNum = currentPage - 3;
        this.endNavNum = currentPage + 2;

        if (startNavNum < 1) {
            this.startNavNum = 1;
            this.endNavNum = Math.min(startNavNum + 5, totalPages);
        }

        if (endNavNum > totalPages) {
            this.endNavNum = totalPages;
            this.startNavNum = Math.max(endNavNum - 5, 1);
        }
    }
}
