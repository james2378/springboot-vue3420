const base = {
    get() {
        return {
            url : "http://localhost:8080/fangdicanxiaoshouyingxiao/",
            name: "fangdicanxiaoshouyingxiao",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/fangdicanxiaoshouyingxiao/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "江苏融汇房地产营销策划有限公司"
        } 
    }
}
export default base
