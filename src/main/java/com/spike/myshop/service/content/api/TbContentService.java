package com.spike.myshop.service.content.api;

import com.github.pagehelper.PageInfo;
import com.spike.myshop.commons.domain.TbContent;

public interface TbContentService {
    PageInfo<TbContent> page(int start, int length, TbContent tbContent);
}
