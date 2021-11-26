/**
 * Main 部件模型
 *
 * @export
 * @class MainModel
 */
export default class MainModel {

	/**
	 * 是否是实体数据导出
	 *
	 * @returns {any[]}
	 * @memberof MainGridMode
	 */
	public isDEExport: boolean = false;

	/**
	 * 获取数据项集合
	 *
	 * @returns {any[]}
	 * @memberof MainGridMode
	 */
	public getDataItems(): any[] {
    if(this.isDEExport){
		  return [
      ]
    }else{
		  return [
        {
          name: 'qssj',
          prop: 'qssj',
          dataType: 'DATETIME',
        },
        {
          name: 'ygbh',
          prop: 'ygbh',
          dataType: 'TEXT',
        },
        {
          name: 'pcmxygzzkhjgjlname',
          prop: 'pcmxygzzkhjgjlname',
          dataType: 'TEXT',
        },
        {
          name: 'jssj',
          prop: 'jssj',
          dataType: 'DATETIME',
        },
        {
          name: 'fs',
          prop: 'fs',
          dataType: 'FLOAT',
        },
        {
          name: 'srfmajortext',
          prop: 'pcmxygzzkhjgjlname',
          dataType: 'TEXT',
        },
        {
          name: 'srfdataaccaction',
          prop: 'pcmxygzzkhjgjlid',
          dataType: 'GUID',
        },
        {
          name: 'srfkey',
          prop: 'pcmxygzzkhjgjlid',
          dataType: 'GUID',
        },
        {
          name: 'pj',
          prop: 'pj',
          dataType: 'SSCODELIST',
        },
        {
          name: 'pcmxygzzkhjgjl',
          prop: 'pcmxygzzkhjgjlid',
        },

        {
          name:'size',
          prop:'size'
        },
        {
          name:'query',
          prop:'query'
        },
        {
          name:'page',
          prop:'page'
        },
        {
          name:'sort',
          prop:'sort'
        },
        {
          name:'srfparentdata',
          prop:'srfparentdata'
        },
        // 前端新增修改标识，新增为"0",修改为"1"或未设值
        {
          name: 'srffrontuf',
          prop: 'srffrontuf',
          dataType: 'TEXT',
        },
      ]
    }
  }

}