package com.lychee.commentdemo;

import java.util.List;

/**
 * Created by Lychee of on 2018/4/18 11:19.
 * <p>
 * Author: HeJingzhou
 * <p>
 * Email: tcowork@163.com
 */
public class CommentEntity {

    /**
     * result : true
     * data : [{"id":"3d44418027bd4e2ea2f144291cdc2160","userId":"313c9f6a0be547d78e903abddf5e53a5","userPhoto":"/userfiles/313c9f6a0be547d78e903abddf5e53a5//images/photo/2017/08/71c7c914-de80-47aa-a183-8ae1a588f074.JPEG","userName":"韩贵林","content":"价格怎么样？","date":"刚刚","commentCount":0,"greatCount":0,"mbCommentList":[{"id":"c080f1a44e4c468c9a3f61badf2a984a","userId":"313c9f6a0be547d78e903abddf5e53a5","userName":"韩贵林","userPhoto":"/userfiles/313c9f6a0be547d78e903abddf5e53a5//images/photo/2017/08/71c7c914-de80-47aa-a183-8ae1a588f074.JPEG","date":"刚刚","content":"你要多少,我就在附近我可以帮你买。","toUserId":"313c9f6a0be547d78e903abddf5e53a5","toUserName":"韩贵林","my":true,"realName":null,"expert":true},{"id":"c080f1a44e4c468c9a3f61badf2a984a","userId":"313c9f6a0be547d78e903abddf5e53a5","userName":"韩贵林","userPhoto":"/userfiles/313c9f6a0be547d78e903abddf5e53a5//images/photo/2017/08/71c7c914-de80-47aa-a183-8ae1a588f074.JPEG","date":"刚刚","content":"你要多少,我就在附近我可以帮你买。","toUserId":"313c9f6a0be547d78e903abddf5e53a5","toUserName":"韩贵林","my":true,"realName":null,"expert":true},{"id":"c080f1a44e4c468c9a3f61badf2a984a","userId":"313c9f6a0be547d78e903abddf5e53a5","userName":"韩贵林","userPhoto":"/userfiles/313c9f6a0be547d78e903abddf5e53a5//images/photo/2017/08/71c7c914-de80-47aa-a183-8ae1a588f074.JPEG","date":"刚刚","content":"你要多少,我就在附近我可以帮你买。","toUserId":"313c9f6a0be547d78e903abddf5e53a5","toUserName":"韩贵林","my":true,"realName":null,"expert":true},{"id":"c080f1a44e4c468c9a3f61badf2a984a","userId":"313c9f6a0be547d78e903abddf5e53a5","userName":"韩贵林","userPhoto":"/userfiles/313c9f6a0be547d78e903abddf5e53a5//images/photo/2017/08/71c7c914-de80-47aa-a183-8ae1a588f074.JPEG","date":"刚刚","content":"你要多少,我就在附近我可以帮你买。","toUserId":"313c9f6a0be547d78e903abddf5e53a5","toUserName":"韩贵林","my":true,"realName":null,"expert":true}],"my":true,"greate":false,"realName":false,"expert":true}]
     * message : 请求成功!
     */

    private boolean result;
    private String message;
    private List<DataBean> data;

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 3d44418027bd4e2ea2f144291cdc2160
         * userId : 313c9f6a0be547d78e903abddf5e53a5
         * userPhoto : /userfiles/313c9f6a0be547d78e903abddf5e53a5//images/photo/2017/08/71c7c914-de80-47aa-a183-8ae1a588f074.JPEG
         * userName : 韩贵林
         * content : 价格怎么样？
         * date : 刚刚
         * commentCount : 0
         * greatCount : 0
         * mbCommentList : [{"id":"c080f1a44e4c468c9a3f61badf2a984a","userId":"313c9f6a0be547d78e903abddf5e53a5","userName":"韩贵林","userPhoto":"/userfiles/313c9f6a0be547d78e903abddf5e53a5//images/photo/2017/08/71c7c914-de80-47aa-a183-8ae1a588f074.JPEG","date":"刚刚","content":"你要多少,我就在附近我可以帮你买。","toUserId":"313c9f6a0be547d78e903abddf5e53a5","toUserName":"韩贵林","my":true,"realName":null,"expert":true},{"id":"c080f1a44e4c468c9a3f61badf2a984a","userId":"313c9f6a0be547d78e903abddf5e53a5","userName":"韩贵林","userPhoto":"/userfiles/313c9f6a0be547d78e903abddf5e53a5//images/photo/2017/08/71c7c914-de80-47aa-a183-8ae1a588f074.JPEG","date":"刚刚","content":"你要多少,我就在附近我可以帮你买。","toUserId":"313c9f6a0be547d78e903abddf5e53a5","toUserName":"韩贵林","my":true,"realName":null,"expert":true},{"id":"c080f1a44e4c468c9a3f61badf2a984a","userId":"313c9f6a0be547d78e903abddf5e53a5","userName":"韩贵林","userPhoto":"/userfiles/313c9f6a0be547d78e903abddf5e53a5//images/photo/2017/08/71c7c914-de80-47aa-a183-8ae1a588f074.JPEG","date":"刚刚","content":"你要多少,我就在附近我可以帮你买。","toUserId":"313c9f6a0be547d78e903abddf5e53a5","toUserName":"韩贵林","my":true,"realName":null,"expert":true},{"id":"c080f1a44e4c468c9a3f61badf2a984a","userId":"313c9f6a0be547d78e903abddf5e53a5","userName":"韩贵林","userPhoto":"/userfiles/313c9f6a0be547d78e903abddf5e53a5//images/photo/2017/08/71c7c914-de80-47aa-a183-8ae1a588f074.JPEG","date":"刚刚","content":"你要多少,我就在附近我可以帮你买。","toUserId":"313c9f6a0be547d78e903abddf5e53a5","toUserName":"韩贵林","my":true,"realName":null,"expert":true}]
         * my : true
         * greate : false
         * realName : false
         * expert : true
         */

        private String id;
        private String userId;
        private String userPhoto;
        private String userName;
        private String content;
        private String date;
        private int commentCount;
        private int greatCount;
        private boolean my;
        private boolean greate;
        private boolean realName;
        private boolean expert;
        private List<MbCommentListBean> mbCommentList;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getUserPhoto() {
            return userPhoto;
        }

        public void setUserPhoto(String userPhoto) {
            this.userPhoto = userPhoto;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public int getCommentCount() {
            return commentCount;
        }

        public void setCommentCount(int commentCount) {
            this.commentCount = commentCount;
        }

        public int getGreatCount() {
            return greatCount;
        }

        public void setGreatCount(int greatCount) {
            this.greatCount = greatCount;
        }

        public boolean isMy() {
            return my;
        }

        public void setMy(boolean my) {
            this.my = my;
        }

        public boolean isGreate() {
            return greate;
        }

        public void setGreate(boolean greate) {
            this.greate = greate;
        }

        public boolean isRealName() {
            return realName;
        }

        public void setRealName(boolean realName) {
            this.realName = realName;
        }

        public boolean isExpert() {
            return expert;
        }

        public void setExpert(boolean expert) {
            this.expert = expert;
        }

        public List<MbCommentListBean> getMbCommentList() {
            return mbCommentList;
        }

        public void setMbCommentList(List<MbCommentListBean> mbCommentList) {
            this.mbCommentList = mbCommentList;
        }

        public static class MbCommentListBean {
            /**
             * id : c080f1a44e4c468c9a3f61badf2a984a
             * userId : 313c9f6a0be547d78e903abddf5e53a5
             * userName : 韩贵林
             * userPhoto : /userfiles/313c9f6a0be547d78e903abddf5e53a5//images/photo/2017/08/71c7c914-de80-47aa-a183-8ae1a588f074.JPEG
             * date : 刚刚
             * content : 你要多少,我就在附近我可以帮你买。
             * toUserId : 313c9f6a0be547d78e903abddf5e53a5
             * toUserName : 韩贵林
             * my : true
             * realName : null
             * expert : true
             */

            private String id;
            private String userId;
            private String userName;
            private String userPhoto;
            private String date;
            private String content;
            private String toUserId;
            private String toUserName;
            private boolean my;
            private Object realName;
            private boolean expert;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getUserId() {
                return userId;
            }

            public void setUserId(String userId) {
                this.userId = userId;
            }

            public String getUserName() {
                return userName;
            }

            public void setUserName(String userName) {
                this.userName = userName;
            }

            public String getUserPhoto() {
                return userPhoto;
            }

            public void setUserPhoto(String userPhoto) {
                this.userPhoto = userPhoto;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getToUserId() {
                return toUserId;
            }

            public void setToUserId(String toUserId) {
                this.toUserId = toUserId;
            }

            public String getToUserName() {
                return toUserName;
            }

            public void setToUserName(String toUserName) {
                this.toUserName = toUserName;
            }

            public boolean isMy() {
                return my;
            }

            public void setMy(boolean my) {
                this.my = my;
            }

            public Object getRealName() {
                return realName;
            }

            public void setRealName(Object realName) {
                this.realName = realName;
            }

            public boolean isExpert() {
                return expert;
            }

            public void setExpert(boolean expert) {
                this.expert = expert;
            }
        }
    }
}
