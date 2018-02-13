package model;

/**
 * Created by tanke on 2018/2/12.
 */
/*
*作者：李潮
*时间：2018/2/12
*类名：Gift
*/
public class Gift {
    private Long gId;
    private String giftName;
    private String icon;
    private String cover;
    private Integer showType;
    private Integer status;
    private Long weight;
    private Long presCoin;
    private Long origCoin;
    private Double amount;
    private String content;
    private Long interval;
    private Long adminUserId;
    private String createTime;

    public Long getgId() {
        return gId;
    }

    public void setgId(Long gId) {
        this.gId = gId;
    }

    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Integer getShowType() {
        return showType;
    }

    public void setShowType(Integer showType) {
        this.showType = showType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public Long getPresCoin() {
        return presCoin;
    }

    public void setPresCoin(Long presCoin) {
        this.presCoin = presCoin;
    }

    public Long getOrigCoin() {
        return origCoin;
    }

    public void setOrigCoin(Long origCoin) {
        this.origCoin = origCoin;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getInterval() {
        return interval;
    }

    public void setInterval(Long interval) {
        this.interval = interval;
    }

    public Long getAdminUserId() {
        return adminUserId;
    }

    public void setAdminUserId(Long adminUserId) {
        this.adminUserId = adminUserId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Gift{" +
                "gId=" + gId +
                ", giftName='" + giftName + '\'' +
                ", icon='" + icon + '\'' +
                ", cover='" + cover + '\'' +
                ", showType=" + showType +
                ", status=" + status +
                ", weight=" + weight +
                ", presCoin=" + presCoin +
                ", origCoin=" + origCoin +
                ", amount=" + amount +
                ", content='" + content + '\'' +
                ", interval=" + interval +
                ", adminUserId=" + adminUserId +
                ", createTime='" + createTime + '\'' +
                '}';
    }
}
