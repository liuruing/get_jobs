package utils;

import utils.Job;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 职位筛选器
 */
public class JobFilter {

    /**
     * 根据预定义规则筛选职位列表。
     *
     * @param jobList 待筛选的职位列表
     * @return 筛选后的职位列表
     */
    public List<Job> filterJobs(List<Job> jobList) {
        // 这是一个基本的筛选逻辑示例
        // TODO: 实现更复杂的筛选规则
        return jobList.stream()
                // 示例：只保留职位名称包含 "Java" 的职位
                .filter(job -> job.getJobName() != null && job.getJobName().toLowerCase().contains("java"))
                .collect(Collectors.toList());
    }
} 