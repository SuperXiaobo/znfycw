package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Face;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2021-03-02
 */
public interface IFaceService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param name 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public Face selectFaceById(String name);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param face 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Face> selectFaceList(Face face);

    /**
     * 新增【请填写功能名称】
     * 
     * @param face 【请填写功能名称】
     * @return 结果
     */
    public int insertFace(Face face);

    /**
     * 修改【请填写功能名称】
     * 
     * @param face 【请填写功能名称】
     * @return 结果
     */
    public int updateFace(Face face);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param names 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    public int deleteFaceByIds(String[] names);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param name 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteFaceById(String name);
}
