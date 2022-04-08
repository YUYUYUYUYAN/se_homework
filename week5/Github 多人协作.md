<p>GitHub 多人协作：<br>
1.fork 集体仓库到自己仓库内；</p>
<p>2.点击 Branch:master 按钮，在下拉列表中填写分支名称，并切换到该分支；</p>
<ol start="3">
<li>
<p>点击 Clone or Download，然后在下拉列表中点击链接右侧的按钮，这时复制了仓库的链接；</p>
</li>
<li>
<p>在本地目录右键，点击 Git Bash Here；</p>
</li>
</ol>
<p>5.输入 git clone <a href="https://github.com/xxx(%E7%B2%98%E8%B4%B4%E4%BB%93%E5%BA%93%E9%93%BE%E6%8E%A5)%EF%BC%8C%E5%9B%9E%E8%BD%A6%EF%BC%9B">https://github.com/xxx(粘贴仓库链接)，回车；</a><br>
此时开始将仓库拉取到本地，完成后可进行修改：<br>
修改完毕后再次打开 Git Bash Here，输入：</p>
<p>git add . // 将文件更新<br>
git commit -m "original commit" // 提交到分支，并添加说明<br>
git push -u origin master english // 将更新内容推送到分支 english 上</p>
<p>6.回到自己 Fork 的仓库，切换到刚刚创建的分支上 pull request<br>
添加说明并确认之后就完成了一次提交。</p>