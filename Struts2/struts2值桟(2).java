！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
匯,壅霧峙�C諒籾					|
！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
	* 宸叫廉頁匯倖佃泣,匆頁struts2議宰伉侭壓!
	* 峪勣頁匯倖MVC崇尺,駅倬盾畳議諒籾祥頁:'方象議贋才函'
	
	* struts2旋喘峙�C贋方象,侭參峙�C頁匯倖贋刈方象議坪贋潤更!
	* 委方象贋慧峙�C嶄,壓匈中聞喘OGNL序佩�塋�

	* ValueStack 頁匯倖俊笥,struts2嶄聞喘議頁万議糞�崟� OgnlValueStack
	* OGNL,功云祥音頁struts2議叫廉,万頁匯倖斤�鶺失粛紗鑵�.辛參効象斤�鸚寛掀�斤�鶺超塹�
	  低匆辛參委万尖盾葎,総匯倖崇尺.struts2岷俊祥委繁鎮狛栖喘阻.

！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
屈,峙�C --	伏凋巓豚			|
！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！	
	1,資函峙�C
		ValueStack valueStack = ActionContext.getContext().getValueStack();
			* ActionContext 辛參岷俊資函峙�C,万嗤峙�C議哈喘.
		ValueStack valueStack = ServletActionContext.getValueStack(ServletActionContext.getRequest())
		ValueStack valueStack = (ValueStack) ServletActionContext.getRequest().getAttribute(ServletActionContext.STRUTS_VALUESTACK_KEY);
			* 峙�C,珊贋慧壓request囃嶄.
	2,貧中議峙�C,凪糞脅頁揖匯倖!�猥田穢禾Ω致�吭,嗤匯倖圭隈頁貫request囃嶄資函議,
	  載�堡�,峙�C議伏凋巓豚,効request,action頁匯劔議!汽肝萩箔嗤丼!
		
！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
眉,峙�C --	坪贋潤更			|
！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！	
	1,ValueStack 頁匯倖俊笥,徽頁厘断壅struts2嶄!聞喘議頁匯倖糞�崟狃俔�:OgnlValueStack
	2,ValueStack 嗤曾何蛍坪贋曝囃,匆祥頁曾倖坪贋潤更.匯倖 Map ,匯倖 ArrayList
	['context']
		* OgnlContext(OGNL)
		* 嗽各岻葎Map�C,凪糞頁繁社ognl云附祥嗤議叫廉
		* 坿鷹嶄 OgnlContext 凪糞頁 implements Map,侭參万頁匯倖 Map 鹿栽
		* 坪何嶷勣key,蛍裂
			1,_root
				宸倖key葎_root,議峙,祥頁祥頁'root '.匆祥頁傍'context'隔嗤阻斤root議哈喘
			2,_values
				宸倖key出恂_values,議峙.嗽頁匯倖 Map(HashMap),
				request,session,application,response,吉脅壓宸倖 Map 戦中
				萩箔歌方,參式恵諒議Action,參式匯乂啌符(塘崔)佚連,匆脅壓宸倖戦中
			
	['root']	
		* CompoundRoot(xwork)
		* 嗽各岻葎斤���C
		* 坿鷹嶄 CompoundRoot 凪糞頁 extends ArrayList,侭參頁匯倖 ArrayList 鹿栽

！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
膨,峙�C --	方象贋刈			|
！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
	['CompoundRoot']
		valueStack.push(Object obj);
			* 委匯倖斤�鶸翦訌剖塹��C議媚競,低匆辛參宥狛岷俊資函'斤���C議哈喘',valueStack.getRoot(),宥狛荷恬 List 委斤�鶸翦��C硫!
	['OgnlContext']
		
！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
励,峙�C --	方象函竃			|
！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
	['CompoundRoot']
		valueStack.peek();
			* 資函斤���C,媚競議方象
	['OgnlContext']

！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
鎗,峙�C --	潤更課夕			|
！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
ValueStack(峙�C)
	context(implements Map)
		* _root
			祥頁哈喘阻ValueStack嶄議総匯倖潤更	
		* _values(HashMap)				
			1, 贋慧阻Servlet否匂議坪否(request,response,session,appliction -- 凪糞脅頁瓜淫廾狛議,麿断云附匆頁Map潤更)
			2, 輝念萩箔議Action
	root(extends ArrayList)
		* ValueStackAction(輝念萩箔議Action)
		* DefaultTextProvider(忽縞晒)

	OGNL云附徭揮議OgnlContext,匆祥頁context.瓜struts2序佩阻淫廾,嗽公梓阻匯倖root壓翌中!噐頁祥侘撹阻:valueStack!

！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
鈍,峙�C --	械喘API				|
！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
	ValueStack valueStack = ActionContext.getContext().getValueStack();
	* 資函圭隈嗤眉倖,宸戦音�衙�.徭失心貧中

['荷恬斤���C']
	valueStack.push(Object obj);
			* 委匯倖斤��,慧泌欺'root'嶄,媚競議了崔.root,匆祥頁匯倖�C方象潤更議否匂,糞縞峇佩議頁:root(0,o);
	valueStack.peek();
			* 資函議祥頁斤���C,媚競議圷殆.糞縞峇佩議頁:root.peek();宸戦中岷俊 return get(0);
	valueStack.pop()
			* 卞茅媚競議及匯倖圷殆
	valueStack.setParameter(String key,Object value);
			* 委媚競斤�鶺�key奉來,験峙葎value
			* 辛參旋喘宸倖圭隈,岷俊個延斤���C嶄媚競斤�麒�來議峙
	valueStack.getRoot();
			* 卦指議祥頁 List<Object>,祥頁斤���C議哈喘.低辛參徭失委斤�麑躰啜春散�,匆辛參耶紗欺�C久
			* 低誼欺哈喘,辛參返強議資函/贋刈,媚競珊頁�C挑議方象!

['荷恬Map�C']
	辛參宥狛荷恬Servlet囃斤��.栖斤 Map �C議'_values'議方象序佩贋秘/函竃荷恬!
	
！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
伊,峙�C --	潮範儿秘方象				|
！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
	* 子械釘影議返紙峙�C潤更夕
	* 栖徭噐<s:debug/>炎禰
	------------------------------------------------------------------------------------------
	Object								Property Name	Property Value								
	------------------------------------------------------------------------------------------
										container		There is no read method for container
										errorMessages	[]
										actionErrors	[]
	com.kevin.action.ValueStackAction	actionMessages	[]
										fieldErrors		{}
										texts			null
										valueStack		null
										locale			zh_CN
										errors			{}
	------------------------------------------------------------------------------------------
	com.opensymphony.xwork2.DefaultTextProvider	texts	null										
	------------------------------------------------------------------------------------------

	* 凪糞ValueStackAction宸倖Action,写覚阻ActionSupport!椎担貧夕嶄議侭嗤 Property Name �酊�.畠頁栖徭噐云窃參式幻窃議get圭隈
	['悳潤']
		峪勣頁Action嶄贋壓議getXxx();圭隈.祥氏瓜峙�C儿秘欺,CompoundRoot媚競!
			* Property Name 祥頁 getXxxx()議xxx
			* value 祥頁getXxxx()卦指峙!
		委斤�鷏堵覿塹��C嶄,辛參岷俊聞喘<s:property value="奉來兆"/>岷俊恵諒
		泌惚斤���C嶄竃�峩犖��猴�議奉來,椎担宸倖炎禰value奉來氏貫貧吏和蝕兵儖孀,孀欺軸峭!


	

	
	
	

			
	