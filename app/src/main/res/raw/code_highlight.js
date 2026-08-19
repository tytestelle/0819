document.addEventListener('DOMContentLoaded', function() {
    document.querySelectorAll('.code-block').forEach(block => {
        let code = block.textContent || block.innerText;

        // 完全保留原始空行，只清理每行前后空格
        code = code.split('\n').map(line => line.trimEnd()).join('\n');

        // 格式化代码
        const formattedCode = formatJavaScriptCodeManually(code);

        // 创建新的代码显示元素
        const pre = document.createElement('pre');
        pre.className = 'line-numbers';
        pre.style.borderRadius = '6px';
        const codeElem = document.createElement('code');
        codeElem.className = 'language-javascript';
        codeElem.textContent = formattedCode;

        pre.appendChild(codeElem);
        block.parentNode.replaceChild(pre, block);
    });

    // 重新初始化 Prism 高亮
    if (typeof Prism !== 'undefined') {
        Prism.highlightAll();
        if (Prism.plugins && Prism.plugins.lineNumbers) {
            Prism.plugins.lineNumbers();
        }
    }
});

// 修复版的格式化函数 - 完全保留空行和正确处理函数
function formatJavaScriptCodeManually(code) {
    const lines = code.split('\n');
    let indentLevel = 0;
    const formattedLines = [];
    let inSwitch = false;
    let inCaseBlock = false;

    for (let i = 0; i < lines.length; i++) {
        let originalLine = lines[i];
        let line = originalLine.trim();

        // 完全保留空行 - 不进行任何trim处理
        if (line === '') {
            formattedLines.push('');
            continue;
        }

        let currentIndent = indentLevel;

        // === 减少缩进逻辑 ===

        // 大括号结束
        if (line.startsWith('}')) {
            if (inSwitch) {
                inSwitch = false;
                inCaseBlock = false;
            }
            indentLevel = Math.max(0, indentLevel - 1);
            currentIndent = indentLevel;
        }

        // break 语句（在 switch 中）
        else if (line.startsWith('break;') && inCaseBlock) {
            currentIndent = indentLevel - 1;
        }

        // case 和 default 语句
        else if ((line.startsWith('case ') || line.startsWith('default:')) && inSwitch) {
            currentIndent = indentLevel - 1;
            inCaseBlock = true;
        }

        // === 应用缩进 ===
        const indent = '    '.repeat(currentIndent);
        formattedLines.push(indent + line);

        // === 增加缩进逻辑 ===

        // 大括号开始
        if (line.endsWith('{')) {
            if (line.startsWith('switch ')) {
                inSwitch = true;
                inCaseBlock = false;
            }
            indentLevel++;
        }

        // case 语句后的内容需要缩进
        else if ((line.startsWith('case ') || line.startsWith('default:')) && inSwitch) {
            inCaseBlock = true;
        }
    }

    return formattedLines.join('\n');
}