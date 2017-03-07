<#if !online??><#include "/localDevelopment/data/dataModel.ftl"><#else><#include "/20160216-wap/localDevelopment/data/onlineModel.ftl"></#if>
<#include "${rootURL.ftl}/include/pubHtml.ftl">

</head><body>
<div class="demo-box-1">
  <h1>基础样式</h1>
  <div class="demo-box-2">
    <h2 class="demo-title-1">字体</h2>
    <div class="demo-con-1"> <span class="b-h1-1">b-ff-1</span><br />
      <span class="b-ff-2">b-ff-2</span><br />
    </div>
  </div>
  <div class="demo-box-2">
    <h2 class="demo-title-1">字号</h2>
    <div class="demo-con-1"> <span class="b-h1">b-h1</span><br />
      <span class="b-h2">b-h2</span><br />
      <span class="b-h3">b-h3</span><br />
      <span class="b-h4">b-h4</span> </div>
  </div>
  <div class="demo-box-2">
    <h2 class="demo-title-1">字体加粗</h2>
    <div class="demo-con-1"> <span class="b-fb">b-fb</span> </div>
  </div>
  <div class="demo-box-2">
    <h2 class="demo-title-1">文本颜色</h2>
    <div class="demo-con-1">
      <div class="b-color-1">b-color-1</div>
      <div class="b-color-2">b-color-2</div>
    </div>
  </div>
  <div class="demo-box-2">
    <h2 class="demo-title-1">文本对齐</h2>
    <div class="demo-con-1">
      <div class="b-text-left">b-text-left</div>
      <div class="b-text-right">b-text-right</div>
      <div class="b-text-center">b-text-center</div>
    </div>
  </div>
  <div class="demo-box-2">
    <h2 class="demo-title-1">链接颜色</h2>
    <div class="demo-con-1">
      <div><a class="b-link-1" href="#">b-link-1</a></div>
      <div><a class="b-link-2" href="#">b-link-2</a></div>
    </div>
  </div>
  <div class="demo-box-2">
    <h2 class="demo-title-1">背景颜色</h2>
    <div class="demo-con-1">
      <div class="b-bg-1">b-bg-1</div>
      <div class="b-bg-2">b-bg-2</div>
    </div>
  </div>
  <div class="demo-box-2">
    <h2 class="demo-title-1">行间距</h2>
    <div class="demo-con-1">
      <table class="demo-table-1">
        <tr>
          <td valign="top"><div class="b-lh-1">b-lh-1<br/>
              b-lh-1<br/>
              b-lh-1</div></td>
          <td valign="top"><div class="b-lh-2">b-lh-2<br/>
              b-lh-2<br/>
              b-lh-2</div></td>
        </tr>
      </table>
    </div>
  </div>
</div>
<div class="demo-box-1">
  <h1>UI样式</h1>
  <div class="demo-box-2">
    <h2 class="demo-title-1">按钮样式</h2>
    <div class="demo-con-1"><br />
      <div>
        <button class="ui-btn-1">普通按钮</button>
      </div>
      <br />
      <div>
        <button class="ui-btn-icon-1" ><span class="icon-tasks ui-btn-icon"></span>有icon的按钮(左)</button>
      </div>
      <br />
      <div>
        <button class="ui-btn-icon-2" ><span class="icon-briefcase ui-btn-icon"></span>有icon的按钮(右)</button>
      </div>
      <br />
      <div>
        <button class="ui-btn-1 ui-btn-disabled">不可用按钮</button>
      </div>
      <br />
    </div>
  </div>
  <div class="demo-box-2">
    <h2 class="demo-title-1">列表菜单</h2>
    <div class="demo-con-1">
      <div class="ui-list-1">
        <div class="ui-list-li"> <a href="#" class="ui-list-a ui-list-a-icon ui-list-active"><i class="icon-tasks ui-list-icon"></i>我的产品<i class="icon-angle-down ui-list-icon"></i></a> </div>
        <div class="ui-list-1 ui-list-clild">
          <div class="ui-list-li"> <a href="#" class="ui-list-a">电商产品</a> </div>
          <div class="ui-list-li"> <a href="#" class="ui-list-a">电商产品</a> </div>
        </div>
        <div class="ui-list-li"> <a href="#" class="ui-list-a ui-list-a-icon"><i class="icon-envelope ui-list-icon"></i>我的邮件<i class="icon-angle-left ui-list-icon"></i></a> </div>
      </div>
    </div>
  </div>
  <div class="demo-box-2">
    <h2 class="demo-title-1">表单</h2>
    <div class="demo-con-1">
      <div>
        <form action="#" class="ui-form">
          <div class="control-group">
            <label class="control-label">表单标题</label>
            <div class="controls">
              <input type="text" placeholder="请输入" class="m-wrap">
              <span class="help-inline">提示文本</span> </div>
          </div>
          <div class="control-group">
            <label class="control-label">表单标题</label>
            <div class="controls">
              <input type="text" placeholder="medium" class="m-wrap medium">
              <div><span class="help-inline">换行提示文本</span></div>
            </div>
          </div>
          <div class="control-group">
            <label class="control-label">表单标题</label>
            <div class="controls">
              <input class="m-wrap medium" type="text" placeholder="Disabled input here..." disabled="">
            </div>
          </div>
          <div class="control-group">
            <label class="control-label">Small Dropdown</label>
            <div class="controls">
              <select class="small m-wrap" tabindex="1">
                <option value="Category 1">Category 1</option>
                <option value="Category 2">Category 2</option>
                <option value="Category 3">Category 5</option>
                <option value="Category 4">Category 4</option>
              </select>
            </div>
          </div>
          <div class="control-group">
            <label class="control-label">Small Dropdown</label>
            <div class="controls">
              <div class="input-append">
                <input class="m-wrap" type="text">
                <button class="ui-btn-1" type="button">Search!</button>
              </div>
            </div>
          </div>
          <div class="control-group">
            <label class="control-label">Textarea</label>
            <div class="controls">
              <textarea class="medium m-wrap" rows="3"></textarea>
            </div>
          </div>
          <div class="form-actions">
            <button type="submit" class="ui-btn-1">Save</button>
            <button type="button" class="ui-btn-2">Cancel</button>
          </div>
        </form>
      </div>
    </div>
  </div>
  <div class="demo-box-2">
    <h2 class="demo-title-1">表格</h2>
    <div class="demo-con-1">
      <table class="ui-table">
        <thead>
          <tr>
            <th>#</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Username</th>
            <th>Status</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>1</td>
            <td>Mark</td>
            <td>Otto</td>
            <td>makr124</td>
            <td>Approved</td>
          </tr>
          <tr>
            <td>2</td>
            <td>Jacob</td>
            <td>Nilson</td>
            <td>jac123</td>
            <td>Pending</td>
          </tr>
          <tr>
            <td>3</td>
            <td>Larry</td>
            <td>Cooper</td>
            <td>lar</td>
            <td>Suspended</td>
          </tr>
          <tr>
            <td>3</td>
            <td>Sandy</td>
            <td>Lim</td>
            <td>sanlim</td>
            <td>Blocked</td>
          </tr>
        </tbody>
      </table>
    </div>
  </div>
  <div class="demo-box-2">
    <h2 class="demo-title-1">外框</h2>
    <div class="demo-con-1">
      <div class="ui-box">
        <div class="ui-box-title">标题<span class="ui-box-tools"><i class="icon-tasks"></i></span></div>
        <div class="ui-box-body">
          <table class="ui-table">
            <thead>
              <tr>
                <th>#</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Username</th>
                <th>Status</th>
              </tr>
            </thead>
            <tbody>
              <tr>
                <td>1</td>
                <td>Mark</td>
                <td>Otto</td>
                <td>makr124</td>
                <td>Approved</td>
              </tr>
              <tr>
                <td>2</td>
                <td>Jacob</td>
                <td>Nilson</td>
                <td>jac123</td>
                <td>Pending</td>
              </tr>
              <tr>
                <td>3</td>
                <td>Larry</td>
                <td>Cooper</td>
                <td>lar</td>
                <td>Suspended</td>
              </tr>
              <tr>
                <td>3</td>
                <td>Sandy</td>
                <td>Lim</td>
                <td>sanlim</td>
                <td>Blocked</td>
              </tr>
            </tbody>
          </table>
        </div>
      </div>
    </div>
  </div>
  <div class="demo-box-2">
    <h2 class="demo-title-1">翻页选择</h2>
    <div class="demo-con-1">
      <div class="ui-pagination">
        <ul>
          <li><a href="#">«</a></li>
          <li><a href="#">1</a></li>
          <li><a href="#">2</a></li>
          <li><a href="#">3</a></li>
          <li><a href="#">4</a></li>
          <li><a href="#">»</a></li>
        </ul>
      </div>
    </div>
  </div>
  
  
  <div class="demo-box-2">
    <h2 class="demo-title-1">breadcrumb</h2>
    <div class="demo-con-1">
      <ul class="ui-breadcrumb">

              <li>

                <i class="icon-home"></i>

                <a href="index.html">Home</a> 

                <i class="icon-angle-right"></i>

              </li>

              <li>

                <a href="#">UI Features</a>

                <i class="icon-angle-right"></i>

              </li>

              <li><a href="#">General</a></li>

            </ul>
    </div>
  </div>
  


<div class="ui-loading" id="loading">
<div class="ui-loading-mask"></div>
<div class="ui-loading-img"><img src="/cdnStaticSource20170224/public/images/loader.gif" /><div class="ui-loading-text">正在提交中</div></div>
</div>

  
</div>
</body>
</html>