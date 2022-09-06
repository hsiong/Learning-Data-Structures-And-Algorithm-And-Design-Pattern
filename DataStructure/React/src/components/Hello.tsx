import React from "react";
import { render } from '@testing-library/react';

/**
 * 定义了一个类型Props
 */
export interface Props {
    name: string;
    level?: number;
}

export default Hello;

/**
 * 使用函数 定义一个 无状态的函数式组件 
 * @param param0 
 * @returns 
 */
function Hello({name, level = 1} : Props) {
    if (level <= 0) {
        throw new Error('Error :D');
    }

    return (<div className="hello">
        <div className="greeting">
            Hello {
                name + getMark(level)
            }
        </div>
    </div>)
}

function getMark(numChars: number) {
    return Array(numChars + 1 )
}

/**
 * 使用类的方式定义一个组件
 * 把状态指定为了object
 */
class Hello2 extends React.Component<Props, object> {
    render() {
        const {name, level = 1} = this.props;

        if (level <= 0) {
            throw new Error("Error :D");
        }
        return (<div className="hello">
        <div className="greeting">
            Hello2 {
                name + getMark(level)
            }
        </div>
    </div>)
    }
}
