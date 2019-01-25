function ajaxImgUpload(ajaxImg) {
    var fileElementId = ajaxImg.fileElementId;
    var file =  document.getElementById(fileElementId).files[0];
    var reader = new FileReader(), img = new Image();
    reader.readAsDataURL(file);
    reader.onload = function(e) {
        img.src = e.target.result;
    }
    img.onload = function () {
        var originWidth = this.width;
        var originHeight = this.height;
        var maxWidth = 1000, maxHeight = 1000;
        var targetWidth = originWidth, targetHeight = originHeight;
        if (file.size > 500 * 1024 && (originWidth > maxWidth || originHeight > maxHeight)) {
            if (originWidth / originHeight > maxWidth / maxHeight) {
                // 更宽，按照宽度限定尺寸
                targetWidth = maxWidth;
                targetHeight = Math.round(maxWidth * (originHeight / originWidth));
            } else {
                targetHeight = maxHeight;
                targetWidth = Math.round(maxHeight * (originWidth / originHeight));
            }
        }
        var canvas = document.createElement('canvas');
        var context = canvas.getContext('2d');
        // canvas对图片进行缩放
        canvas.width = targetWidth;
        canvas.height = targetHeight;
        // 清除画布
        context.clearRect(0, 0, targetWidth, targetHeight);
        // 图片压缩
        context.drawImage(img, 0, 0, targetWidth, targetHeight);
        // canvas转为blob并上传
        canvas.toBlob(function (blob) {
            var xhr = new XMLHttpRequest();
            // 开始上传
            console.log("压缩前：" + file.size);
            console.log("压缩后：" + blob.size);
            return;
            xhr.open("POST", ajaxImg.url, true);
            var formdata = new FormData();
            formdata.append('img', blob);
            if(ajaxImg.data) {
                var d = ajaxImg.data;
                for(var i in d) {
                    formdata.append(i, d[i]);
                }
            }
            xhr.send(formdata);
            xhr.onreadystatechange = function() { 
                if (xhr.readyState == 4) { 
                    if (xhr.status == 200) {
                        var res = JSON.parse(xhr.responseText);
                        ajaxImg.success(res);
                    }
                }
            }
        }, file.type || 'image/png');
    };
}
