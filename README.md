### 使用
    - 先申请权限,再拿返回数据
        ```java
            if (intent != null) {
            Bundle extras = intent.getExtras();
            ArrayList<Contact> listContacts = extras.getParcelableArrayList("listContacts");
            }
        ```