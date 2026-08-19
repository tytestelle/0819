function newName() {
    doAction('newName', { name: $('#diy_input_name').val() });
}

function newUrl() {
    doAction('newUrl', { url: $('#diy_input_url').val() });
}

function doAction(action, kv) {
    kv['do'] = action;
    // alert(JSON.stringify(kv));
    $.post('/action', kv, function (data) {
        console.log(data);
        // alert(data);
    });
    return false;
}

function tpl_top(path) {
    return `<a class="weui-cell  weui-cell_access" href="javascript:void(0)" onclick="listFile('` + path + `')">
    <div class="weui-cell__hd"><img src="`+ ic_dir + `" alt="" style="width: 32px; margin-right: 16px; display: block;"></div>
    <span class="weui-cell__bd">
        <span>..</span>
    </span>
    <span class="weui-cell__ft">
    </span>
    </a>`;
}

function tpl_dir(name, time, path) {
    return `<a class="weui-cell  weui-cell_access" href="#" onclick="listFile('` + path + `')">
    <div class="weui-cell__hd"><img src="`+ ic_dir + `" alt="" style="width: 32px; margin-right: 16px; display: block;"></div>
    <span class="weui-cell__bd">
    <span>`+ name + `</span>
        <div class="weui-cell__desc">`+ time + `</div>
    </span>
    <span class="weui-cell__ft">
    </span>
    </a>`;
}

function tpl_file(name, time, path, canDel) {
    return `<a class="weui-cell  weui-cell_access" href="javascript:void(0)" onclick="selectFile('` + path + `', ` + canDel + `)">
    <div class="weui-cell__hd"><img src="`+ ic_file + `" alt="" style="width: 32px; margin-right: 16px; display: block;"></div>
    <span class="weui-cell__bd">
        <span>`+ name + `</span>
        <div class="weui-cell__desc">`+ time + `</div>
    </span>
    </a>`;
}

function clear_list() {
    $('#file_list').html('');
}

function add_file(node) {
    $('#file_list').append(node);
}

let ic_dir = 'data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAYAAABzenr0AAAABHNCSVQICAgIfAhkiAAAAAlwSFlzAAAA7AAAAOwBeShxvQAAABl0RVh0U29mdHdhcmUAd3d3Lmlua3NjYXBlLm9yZ5vuPBoAAAIoSURBVFiF7Ze/T9RgGMc/T9/WO+74IXdRNKCJxETPQaOJi8LoxiouTurmv+DAYvwH3JzVhOhgSHByMTqY6GBCCBFMcJFwURC4O1rbvo8DoIg9rvHuYOGTdGjfb/J88vZpn1Z0bKw7JjsiaCcJqMiCKQ1OyuhonLTeLG5MZlLQq/UCooqd/nwfuNcOAUfgSorcbR0fN20RACRF7hgzc0PtEJB47IGmCSq8EXjbOKjG+VG54Buv531puK/WkfO2L0cY+ZI5ksVfD84vTt91U5vCEBvH7qxU0GqV18PX+Xg2+e6GFmZXhPlc3zOX5dW0Do2xMbIeEBuXmVMX68Y8BwxQzhXFlWqtdQKbzA+cIch0pMq630vgX55DTJgY+Bn18ql8hyAqphb4VjjeMLPVeG722nOKztddw0EPTARPUws0ohqB3TRw8w2KAwyaCRara/i2u+niCqxHf85TPQWe+Jw2L3kX3GhaYCdip5xU74FV28dSPNB8QZR8VEbCiCe1h+kFWopCVLH42oWz58Xh98s/y9o+CWzjQOBA4EBg3wX+mgWxdwlrTtSJRrjBK0T99glUC49R52jdcG75Fp7/on0C4BGGIeWFMtsHRL4zT2/hMCoerebfHkgYTWm+2/+XHTsQ4h3y6D/ZnxgWjRKvt0wgv3QTa+rN/I0mbDVipxxLe3c5kWjNgqIOSOO/nRajMVu99kF0hi4iM4LQtSfVrWbigHMa21k35NEvWSq4Cnb1Ay8AAAAASUVORK5CYII=';
let ic_file = 'data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAYAAABzenr0AAAABHNCSVQICAgIfAhkiAAAAAlwSFlzAAAA7AAAAOwBeShxvQAAABl0RVh0U29mdHdhcmUAd3d3Lmlua3NjYXBlLm9yZ5vuPBoAAAJdSURBVFiF7ZfLaxNRFMa/c+8MbZO0xAgmGIIxUmtsQCkobsSNO12I7v0PXAjuBDeCCN0I/gvdu3HhQlHBBwouTA1UUoulKXmYSDp59TEzx4XUpmFm0tsMTRd+u5l7uN9vvnvunRmCh+r1+km2+CWAlFedm5byP79PIHRx8tKk4VYjvCawTfvafs0BoN1qThWNYn7h3cK4EgDPI23P07Ox5pM7+zXfVqPRPFbulPO517nQngBmv3JwkwIPQXQDXDs9KAAANI1WtLpVXcx9yEU8AWY/WU95nRvL1tVbfhgLKXcgGq1oZe3XajabPdJdo3VfMOg2AAL7YQ8kUyewIiQs0wQAbG5sjHbqnUUARx0BAMi/IP4oEAxganpnFcuFEggU7q7x3AUHoaED9C6Bp5gZlmUpGQgSENL9OR0B2KUJCssFFAslJQAShPMXzkHX9b0DuCmRTCCRTCgB9JPzSeirhbeUEjDqBgyjoWQgiBCLxyCEcx8494DLZLZtwzbVmpAFeUaqlEA4EkY4Eu5fqKBDeg64bsNVVEoVJQMCITOTga47WznfJefJ4onjiMWjygBSk67jSgcRCYImlNqmr4beA0M/iP4ncDgT+BfBAUThmQDbpv+OPZ+8ngBa+xWEWfbFt9PqgJmh6/r7XR5OxduIkpcw9uMsWE4MZM7QMKoFq2uBF2dS6VO1vgArWzPIjDwHSUCOA2DXf0sFit9z6XS61nu7F8AEgLfrD/CtfQUhWR3YNzZS+ngzdPc+ps03TuO7Xjuzn61HzHQPDL1pAvaAu4AZJYvo+uPL9MWt5g/5NsVsHsMO8wAAAABJRU5ErkJggg==';

let current_root = '';
let current_parent = '';
let current_remote = '';
let current_file = '';

function selectFile(path, canDel) {
    $.post('/getStoragePath', { path: "" }, function (StoragePath) {
    current_file = path;
    if (canDel)
        $("#delFileBtn").show();
    else
        $("#delFileBtn").hide();
    // $("#fileUrl0")[0].value = current_remote.replace('clan://', 'http://') + 'file/' + current_file;
    //$("#fileUrl1")[0].value = "clan://localhost/" + current_file;
    $("#fileUrl1")[0].value = "file://"+ StoragePath + "/" + current_file;
    $("#fileUrl2")[0].value = current_remote + current_file;
    $("#fileInfoDialog").show();

    });
}

function fileToApi(type){
    $.post('/getStoragePath', { path: "" }, function (StoragePath) {
    if (type === 1) {
        doAction('newUrl', { url: "file://"+ StoragePath + "/" + current_file });
    } else {
        doAction('newUrl', { url: current_remote + current_file });
    }
    warnToast('已复制地址到对应订阅窗口编辑栏');
      });
}

function hideFileInfo() {
    $("#fileInfoDialog").hide();
}

function listFile(path) {
    $('#loadingToast').show();
    $.get('/file/' + path, function (res) {
        let info = JSON.parse(res);
        let parent = info.parent;
        /*let canDel = info.del === 1;*/
         let canDel = info.parent != '.';
        current_root = path;
        current_parent = parent;
        current_remote = info.remote;
        let array = info.files;
        if (path === '' && array.length == 0)
            warnToast('读取本地文件失败，可能没有存储权限');
        clear_list();
        if (parent !== '.')
            add_file(tpl_top(parent));

        if (canDel) {
            $('#delCurFolder').show();
        } else {
            $('#delCurFolder').hide();
        }

        array.forEach(node => {
            if (node.dir === 1) {
                add_file(tpl_dir(node.name, node.time, node.path));
            } else {
                add_file(tpl_file(node.name, node.time, node.path, canDel));
            }
        });
        $('#loadingToast').hide();
    }).fail(function () {
        warnToast('读取本地文件失败，可能没有存储权限');
        $('#loadingToast').hide();
    });
}

function warnToast(msg) {
    $('#warnToastContent').html(msg);
    $('#warnToast').show();
    setTimeout(() => {
        $('#warnToast').hide();
    }, 1000);
}

function uploadFile() {
    $('#file_uploader').val("");
    $('#file_uploader').click();
}

function uploadTip() {
    let files = $('#file_uploader')[0].files;
    if (files.length <= 0)
        return false;
    let tip = '';
    for (var i = 0; i < files.length; i++) {
        tip += (files[i].name) + ',';
    }
    $('#uploadTipContent').html(tip);
    $('#uploadTip').show();
}

function doUpload(yes) {
    $('#uploadTip').hide();
    if (yes == 1) {
        let files = $('#file_uploader')[0].files;
        if (files.length <= 0)
            return false;
        var formData = new FormData();
        formData.append('path', current_root);
        for (i = 0; i < files.length; i++) {
            formData.append("files-" + i, files[i]);
        }
        $('#loadingToast').show();
        $.ajax({
            url: '/upload',
            type: 'post',
            data: formData,
            processData: false,
            contentType: false,
            complete: function () {
                $('#loadingToast').hide();
                listFile(current_root);
            }
        });
    }
}

function newFolder() {
    $('#newFolder').show();
}

function doNewFolder(yes) {
    $('#newFolder').hide();
    if (yes == 1) {
        let name = $('#newFolderContent')[0].value.trim();
        if (name.length <= 0)
            return false;
        $('#loadingToast').show();
        $.post('/newFolder', { path: current_root, name: '' + name }, function (data) {
            $('#loadingToast').hide();
            listFile(current_root);
        });
    }
}


function delFolder() {
    $('#delFolderContent').html('是否删除 ' + current_root);
    $('#delFolder').show();
}

function doDelFolder(yes) {
    $('#delFolder').hide();
    if (yes == 1) {
        $('#loadingToast').show();
        $.post('/delFolder', { path: current_root }, function (data) {
            $('#loadingToast').hide();
            listFile(current_parent);
        });
    }
}

function delFolder() {
    $('#delFolderContent').html('是否删除 ' + current_root);
    $('#delFolder').show();
}

function doDelFolder(yes) {
    $('#delFolder').hide();
    if (yes == 1) {
        $('#loadingToast').show();
        $.post('/delFolder', { path: current_root }, function (data) {
            $('#loadingToast').hide();
            listFile(current_parent);
        });
    }
}

function delFile() {
    hideFileInfo();
    $('#delFileContent').html('是否删除 ' + current_file);
    $('#delFile').show();
}

function doDelFile(yes) {
    $('#delFile').hide();
    if (yes == 1) {
        $('#loadingToast').show();
        $.post('/delFile', { path: current_file }, function (data) {
            $('#loadingToast').hide();
            listFile(current_root);
        });
    }
}

function showPanel(id) {
    let tab = $('#tab' + id)[0];
    $(tab).attr('aria-selected', 'true').addClass('weui-bar__item_on');
    $(tab).siblings('.weui-bar__item_on').removeClass('weui-bar__item_on').attr('aria-selected', 'false');
    var panelId = '#' + $(tab).attr('aria-controls');
    if (id === 3 && current_remote.length === 0) {
        listFile('')
    }
    $(panelId).css('display', 'block');
    $(panelId).siblings('.weui-tab__panel').css('display', 'none');
}

function toggleFunction(titleElement) {
    const descElement = titleElement.nextElementSibling;
    const toggleIcon = titleElement.querySelector('.function-toggle');

    if (descElement.classList.contains('expanded')) {
        // 收起状态
        descElement.style.maxHeight = "0";
        descElement.style.opacity = "0";
        descElement.classList.remove('expanded');
        toggleIcon.textContent = '▶';
    } else {
        // 展开状态
        descElement.classList.add('expanded');
        descElement.style.maxHeight = descElement.scrollHeight + "px";
        descElement.style.opacity = "1";
        toggleIcon.textContent = '▼';
        updateParentHeights(descElement);
    }
}

function updateParentHeights(element) {
    let current = element.parentElement;

    while (current) {
        if (current.classList && current.classList.contains('weui-media-box__desc') && current.classList.contains('expanded')) {
            current.style.maxHeight = current.scrollHeight + "px";
        }
        current = current.parentElement;
    }
}

document.addEventListener('DOMContentLoaded', function() {
    function toggleContent(titleElement) {
        const descElement = titleElement.nextElementSibling;

        if (descElement.classList.contains('expanded')) {
            // 收起状态
            descElement.style.maxHeight = "0";
            descElement.style.opacity = "0";
            descElement.classList.remove('expanded');
        } else {
            // 展开状态
            descElement.classList.add('expanded');
            descElement.style.maxHeight = descElement.scrollHeight + "px";
            descElement.style.opacity = "1";
        }
    }

    // 为所有标题添加点击事件
    document.querySelectorAll('.weui-media-box__title').forEach(title => {
        title.addEventListener('click', function() {
            toggleContent(this);
        });
    });
});

$(function () {
    $('.weui-tabbar__item').on('click', function () {
        showPanel(parseInt($(this).attr('id').substr(3)));
    });
});

//源管理菜单按钮
document.addEventListener('DOMContentLoaded', () => {
    const menuBtn = document.getElementById('menuBtn');
    const sideList = document.getElementById('sideList');
    const overlay = document.getElementById('overlay');

    // 菜单按钮点击事件
    menuBtn.addEventListener('click', (e) => {
        e.stopPropagation();
        const isOpen = sideList.style.width !== '0px';
        sideList.style.width = isOpen ? '0' : '150px';
        overlay.style.display = isOpen ? 'none' : 'block';
    });

    // 点击外部区域关闭侧边栏
    document.addEventListener('click', (e) => {
        if (!sideList.contains(e.target) && !menuBtn.contains(e.target)) {
            sideList.style.width = '0';
            overlay.style.display = 'none';
        }
    });

    // 阻止列表区域点击冒泡
    sideList.addEventListener('click', (e) => {
        e.stopPropagation();
    });

    // 点击遮罩关闭侧边栏
    overlay.addEventListener('click', () => {
        sideList.style.width = '0';
        overlay.style.display = 'none';
    });
});

//源管理获取列表数据
function getCategories() {
    $.post('/getChannelGroup', function(data) {

        $('#sideList .list-item').remove();
        let res = data['categories'];

        if (!Array.isArray(res)) {
            res = Array.from(res);
        }

        if (res.length > 0) {

            res.forEach(function(channel, index) {
            let groupName = channel.groupName;
            let groupNamePath = channel.groupNamePath;

            $('#listBox').append('<div class="list-item" data-groupnamepath="' + groupNamePath + '">' + groupName + '</div>');

            if (index === 0) {
            selectItem(channel);
            }
        });
        } else {
            //warnToast('列表数据为空');
        }
    }).fail(function() {
        warnToast('读取文件夹路径失败');
    });
}

// 列表点击
$('#sideList').on('click', '.list-item', function() {
    let groupNamePath = $(this).data('groupnamepath');
    let groupName = $(this).text();

    $('#editInput').val(groupName);

    $.post('/processGroupPath', { path: groupNamePath }, function(response) {
    $('#channelEditor').val(response);

    }).fail(function() {
        warnToast('请求失败');
    });

// 切换选中的样式
     $('.list-item').removeClass('selected');
     $(this).addClass('selected');

});

// 默认选择第一个项
function selectItem(channel) {
   $('#editInput').val(channel.groupName);

    $.post('/processGroupPath', { path: channel.groupNamePath }, function(response) {
        $('#channelEditor').val(response);
    }).fail(function() {
        warnToast('请求失败');
    });

    $('#sideList .list-item').first().addClass('selected');
}

// 保存按钮点击事件
$('#saveBtn').on('click', function() {
    let selectedItem = $('#sideList .list-item.selected');
    if (selectedItem.length > 0) {
        let groupNamePath = selectedItem.data('groupnamepath');
        let content = $('#channelEditor').val();
        let groupName = $('#editInput').val();

        $.post('/saveGroupPath', { path: groupNamePath, content: content, groupName: groupName }, function(newPath) {
           let index = selectedItem.index();
           selectedItem.remove();
            const $newItem = $('<div class="list-item" data-groupnamepath="' + newPath + '">' + groupName + '</div>');
            $('#sideList .list-item').eq(index).before($newItem);
            //$('#listBox').prepend($newItem);
            $('.list-item').removeClass('selected');
            $newItem.addClass('selected');

            warnToast('保存成功');
        }).fail(function() {
            warnToast('请求失败');
        });
    } else {
        warnToast('请选择一个项');
    }
});

// 重命名
$('#renameFileBtn').on('click', function() {
    let fileNameWithExtension = current_file.split('/').pop();
    $('#newFileName').val(fileNameWithExtension);

    hideFileInfo();
    $('#renameFileDialog').show();
});

function hideRenameDialog() {
    $('#renameFileDialog').hide();
}

// 确认重命名
function confirmRename() {
    let name = $('#newFileName').val().trim();

    if (!name) {
        warnToast('新文件名不能为空');
        return;
    }

    $.post('/renameFile', { path: current_file , name: name }, function(newPath) {
        warnToast('文件重命名成功');
        hideRenameDialog();
        listFile(current_root);
    }).fail(function() {
        warnToast('文件重命名失败');
    });

}

$('#addGroupBtn').on('click', function() {
    $('#addGroupNameDialog').show();
});

function hideAddGroupNameDialog() {
    $('#addGroupNameDialog').hide();
}

// 确认新增分类
function addGroupName() {
    let name = $('#newGroupFileName').val().trim();

    if (!name) {
        warnToast('分类名称不能为空');
        return;
    }

    $.post('/addGroupData', { groupName: name }, function(newPath) {
        const $newItem = $('<div class="list-item" data-groupnamepath="' + newPath + '">' + name + '</div>');
        $('#listBox').prepend($newItem);
        $('.list-item').removeClass('selected');
        $newItem.addClass('selected');
        $('#editInput').val(name);

        $.post('/processGroupPath', { path: newPath }, function(content) {
            $('#channelEditor').val(content);
            warnToast('已新增分类 ' + name);
        });

        hideAddGroupNameDialog();
    }).fail(function() {
        warnToast('创建分类失败');
    });

}

//删除分类
$('#deleteBtn').on('click', function() {
     let selectedItem = $('#sideList .list-item.selected');
     let groupName = selectedItem.text();
     $('#delGroupFileDialog').show();
     $('#delGroupFileContent').html('是否删除分类 ' + groupName);
});

function delGroupFileOk() {
   let selectedItem = $('#sideList .list-item.selected');
       if (selectedItem.length > 0) {
           let groupNamePath = selectedItem.data('groupnamepath');

           $.post('/delGroup', { path: groupNamePath }, function(response) {

               selectedItem.remove();

               $('#channelEditor').val('');
               $('#editInput').val('');

               let firstItem = $('#sideList .list-item').first();
               if (firstItem.length > 0) {

                   firstItem.addClass('selected');
                   let firstGroupNamePath = firstItem.data('groupnamepath');
                   let firstGroupName = firstItem.text();
                   $('#editInput').val(firstGroupName);

                   $.post('/processGroupPath', { path: firstGroupNamePath }, function(response) {
                       $('#channelEditor').val(response);
                   }).fail(function() {
                       warnToast('请求失败');
                   });
               } else {
                   warnToast('没有更多项');
               }

               warnToast('删除成功');

           }).fail(function() {
               warnToast('请求失败');
           });
       } else {
           warnToast('请选择一个项');
       }
       delGroupFileCancel();
}

function delGroupFileCancel() {
    $('#delGroupFileDialog').hide();
}

// 页面加载时获取分类
$(document).ready(function() {
    getCategories();
});

var url = window.location.href;
showPanel(2);