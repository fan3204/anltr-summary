package com.fab.summary;


import java.util.HashMap;
import java.util.Map;

/**
 * TODO
 *
 * @author fab
 * @date 2021/12/17
 */
public class SummaryKeys {

    public enum Keys {
        K_POINT(POINT),
        K_MODULE(MODULE),
        K_TYPE(TYPE),
        K_STATUS(STATUS),
        K_ISSUE(ISSUE),
        K_JIRA(JIRA)
        ;

        private String keyName;

        Keys(String keyName) {
            this.keyName = keyName;
        }

        public String getKeyName() {
            return keyName;
        }
    }

    public static final String POINT = "局点";
    public static final String MODULE = "组件";
    public static final String TYPE = "类型";
    public static final String STATUS = "状态";
    public static final String ISSUE = "问题";
    public static final String JIRA = "单号";


    public static Map<String, String> summaryDir = new HashMap<>();

    static {
        summaryDir.put(POINT, Keys.K_POINT.name());
        summaryDir.put(MODULE, Keys.K_MODULE.name());
        summaryDir.put(TYPE, Keys.K_TYPE.name());
        summaryDir.put(STATUS, Keys.K_STATUS.name());
        summaryDir.put(ISSUE, Keys.K_ISSUE.name());
        summaryDir.put(JIRA, Keys.K_JIRA.name());
    }


}
