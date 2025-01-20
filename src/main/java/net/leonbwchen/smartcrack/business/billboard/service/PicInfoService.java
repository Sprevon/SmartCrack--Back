package net.leonbwchen.smartcrack.business.billboard.service;

import net.leonbwchen.smartcrack.utils.HTTPResult;

/**
 * @author Seven
 */
public interface PicInfoService {
    /**
     * 根据图片id查找
     *
     * @param id
     * @return
     */
    public HTTPResult findById(String id);

    /**
     * 根据时间查找
     *
     * @param start
     * @param end
     * @return
     */
    public HTTPResult findByTimeContain(String start, String end);

    /**
     * 根据开始时间查找
     *
     * @param start
     * @return
     */
    public HTTPResult findByTimeAfter(String start);

    /**
     * 根据截止时间查找
     *
     * @param end
     * @return
     */
    public HTTPResult findByTimeBefore(String end);

    /**
     * 根据操作员信息查找
     * @param userId
     * @return
     */
    public HTTPResult findByOperator(String userId);

    /**
     * 根据拍摄部门查找
     *
     * @param department
     * @return
     */
    public HTTPResult findByDepartment(String department);
}
