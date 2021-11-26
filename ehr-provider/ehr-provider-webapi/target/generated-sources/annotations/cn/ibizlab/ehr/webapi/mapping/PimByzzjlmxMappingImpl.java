package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimByzzjlmx;
import cn.ibizlab.ehr.webapi.dto.PimByzzjlmxDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-04T00:31:56+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PimByzzjlmxMappingImpl implements PimByzzjlmxMapping {

    @Override
    public PimByzzjlmx toDomain(PimByzzjlmxDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimByzzjlmx pimByzzjlmx = new PimByzzjlmx();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimByzzjlmx.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimByzzjlmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getNzzyglx() != null ) {
            pimByzzjlmx.setNzzyglx( dto.getNzzyglx() );
        }
        if ( dto.getSslwgs() != null ) {
            pimByzzjlmx.setSslwgs( dto.getSslwgs() );
        }
        if ( dto.getIstemp() != null ) {
            pimByzzjlmx.setIstemp( dto.getIstemp() );
        }
        if ( dto.getReason() != null ) {
            pimByzzjlmx.setReason( dto.getReason() );
        }
        if ( dto.getFinished() != null ) {
            pimByzzjlmx.setFinished( dto.getFinished() );
        }
        if ( dto.getYzbm() != null ) {
            pimByzzjlmx.setYzbm( dto.getYzbm() );
        }
        if ( dto.getCheckstatus() != null ) {
            pimByzzjlmx.setCheckstatus( dto.getCheckstatus() );
        }
        if ( dto.getCz() != null ) {
            pimByzzjlmx.setCz( dto.getCz() );
        }
        if ( dto.getXygbh() != null ) {
            pimByzzjlmx.setXygbh( dto.getXygbh() );
        }
        if ( dto.getOldyglx() != null ) {
            pimByzzjlmx.setOldyglx( dto.getOldyglx() );
        }
        if ( dto.getJzbshyj() != null ) {
            pimByzzjlmx.setJzbshyj( dto.getJzbshyj() );
        }
        if ( dto.getSslwgsdz() != null ) {
            pimByzzjlmx.setSslwgsdz( dto.getSslwgsdz() );
        }
        if ( dto.getJsrq() != null ) {
            pimByzzjlmx.setJsrq( dto.getJsrq() );
        }
        if ( dto.getJzpspyj() != null ) {
            pimByzzjlmx.setJzpspyj( dto.getJzpspyj() );
        }
        if ( dto.getSxrq() != null ) {
            pimByzzjlmx.setSxrq( dto.getSxrq() );
        }
        if ( dto.getProfilelist() != null ) {
            pimByzzjlmx.setProfilelist( dto.getProfilelist() );
        }
        if ( dto.getTjqk() != null ) {
            pimByzzjlmx.setTjqk( dto.getTjqk() );
        }
        if ( dto.getYwzdjbs() != null ) {
            pimByzzjlmx.setYwzdjbs( dto.getYwzdjbs() );
        }
        if ( dto.getSbcl() != null ) {
            pimByzzjlmx.setSbcl( dto.getSbcl() );
        }
        if ( dto.getJzbspyj() != null ) {
            pimByzzjlmx.setJzbspyj( dto.getJzbspyj() );
        }
        if ( dto.getQsrq() != null ) {
            pimByzzjlmx.setQsrq( dto.getQsrq() );
        }
        if ( dto.getOldygbh() != null ) {
            pimByzzjlmx.setOldygbh( dto.getOldygbh() );
        }
        if ( dto.getDatzqk() != null ) {
            pimByzzjlmx.setDatzqk( dto.getDatzqk() );
        }
        if ( dto.getZtyy() != null ) {
            pimByzzjlmx.setZtyy( dto.getZtyy() );
        }
        if ( dto.getStandardcause() != null ) {
            pimByzzjlmx.setStandardcause( dto.getStandardcause() );
        }
        if ( dto.getPimbyzzjlmxname() != null ) {
            pimByzzjlmx.setPimbyzzjlmxname( dto.getPimbyzzjlmxname() );
        }
        if ( dto.getPeoplenum() != null ) {
            pimByzzjlmx.setPeoplenum( dto.getPeoplenum() );
        }
        if ( dto.getYgbh() != null ) {
            pimByzzjlmx.setYgbh( dto.getYgbh() );
        }
        if ( dto.getBmid() != null ) {
            pimByzzjlmx.setBmid( dto.getBmid() );
        }
        if ( dto.getBm() != null ) {
            pimByzzjlmx.setBm( dto.getBm() );
        }
        if ( dto.getFs() != null ) {
            pimByzzjlmx.setFs( dto.getFs() );
        }
        if ( dto.getYyglx() != null ) {
            pimByzzjlmx.setYyglx( dto.getYyglx() );
        }
        if ( dto.getYbhqysj() != null ) {
            pimByzzjlmx.setYbhqysj( dto.getYbhqysj() );
        }
        if ( dto.getPj() != null ) {
            pimByzzjlmx.setPj( dto.getPj() );
        }
        if ( dto.getZz() != null ) {
            pimByzzjlmx.setZz( dto.getZz() );
        }
        if ( dto.getZzid() != null ) {
            pimByzzjlmx.setZzid( dto.getZzid() );
        }
        if ( dto.getPimpersonid() != null ) {
            pimByzzjlmx.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getPimexaminationresultsid() != null ) {
            pimByzzjlmx.setPimexaminationresultsid( dto.getPimexaminationresultsid() );
        }
        if ( dto.getPimbyygzzsqid() != null ) {
            pimByzzjlmx.setPimbyygzzsqid( dto.getPimbyygzzsqid() );
        }
        if ( dto.getOrmpostid() != null ) {
            pimByzzjlmx.setOrmpostid( dto.getOrmpostid() );
        }
        if ( dto.getOrgid() != null ) {
            pimByzzjlmx.setOrgid( dto.getOrgid() );
        }
        if ( dto.getOrgsectorid() != null ) {
            pimByzzjlmx.setOrgsectorid( dto.getOrgsectorid() );
        }
        if ( dto.getCreatedate() != null ) {
            pimByzzjlmx.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getDqzt() != null ) {
            pimByzzjlmx.setDqzt( dto.getDqzt() );
        }
        if ( dto.getYj() != null ) {
            pimByzzjlmx.setYj( dto.getYj() );
        }
        if ( dto.getCreateman() != null ) {
            pimByzzjlmx.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimByzzjlmx.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            pimByzzjlmx.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getPimbyzzjlmxid() != null ) {
            pimByzzjlmx.setPimbyzzjlmxid( dto.getPimbyzzjlmxid() );
        }
        if ( dto.getCjgzsj() != null ) {
            pimByzzjlmx.setCjgzsj( dto.getCjgzsj() );
        }
        if ( dto.getYgw() != null ) {
            pimByzzjlmx.setYgw( dto.getYgw() );
        }
        if ( dto.getOrmpostname() != null ) {
            pimByzzjlmx.setOrmpostname( dto.getOrmpostname() );
        }
        if ( dto.getXb() != null ) {
            pimByzzjlmx.setXb( dto.getXb() );
        }
        if ( dto.getHklx() != null ) {
            pimByzzjlmx.setHklx( dto.getHklx() );
        }
        if ( dto.getLxdh() != null ) {
            pimByzzjlmx.setLxdh( dto.getLxdh() );
        }
        if ( dto.getPimexaminationresultsname() != null ) {
            pimByzzjlmx.setPimexaminationresultsname( dto.getPimexaminationresultsname() );
        }
        if ( dto.getHightitle() != null ) {
            pimByzzjlmx.setHightitle( dto.getHightitle() );
        }
        if ( dto.getPostaladdress() != null ) {
            pimByzzjlmx.setPostaladdress( dto.getPostaladdress() );
        }
        if ( dto.getHjdz() != null ) {
            pimByzzjlmx.setHjdz( dto.getHjdz() );
        }
        if ( dto.getZjhm() != null ) {
            pimByzzjlmx.setZjhm( dto.getZjhm() );
        }
        if ( dto.getDzjbjsj() != null ) {
            pimByzzjlmx.setDzjbjsj( dto.getDzjbjsj() );
        }
        if ( dto.getPimpersonname() != null ) {
            pimByzzjlmx.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getJg() != null ) {
            pimByzzjlmx.setJg( dto.getJg() );
        }
        if ( dto.getZzmm() != null ) {
            pimByzzjlmx.setZzmm( dto.getZzmm() );
        }
        if ( dto.getQssj() != null ) {
            pimByzzjlmx.setQssj( dto.getQssj() );
        }
        if ( dto.getPimbyygzzsqname() != null ) {
            pimByzzjlmx.setPimbyygzzsqname( dto.getPimbyygzzsqname() );
        }
        if ( dto.getCsrq() != null ) {
            pimByzzjlmx.setCsrq( dto.getCsrq() );
        }
        if ( dto.getJssj() != null ) {
            pimByzzjlmx.setJssj( dto.getJssj() );
        }
        if ( dto.getJkzk() != null ) {
            pimByzzjlmx.setJkzk( dto.getJkzk() );
        }
        if ( dto.getMz() != null ) {
            pimByzzjlmx.setMz( dto.getMz() );
        }

        return pimByzzjlmx;
    }

    @Override
    public PimByzzjlmxDTO toDto(PimByzzjlmx entity) {
        if ( entity == null ) {
            return null;
        }

        PimByzzjlmxDTO pimByzzjlmxDTO = new PimByzzjlmxDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimByzzjlmxDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimByzzjlmxDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getNzzyglx() != null ) {
            pimByzzjlmxDTO.setNzzyglx( entity.getNzzyglx() );
        }
        if ( entity.getSslwgs() != null ) {
            pimByzzjlmxDTO.setSslwgs( entity.getSslwgs() );
        }
        if ( entity.getIstemp() != null ) {
            pimByzzjlmxDTO.setIstemp( entity.getIstemp() );
        }
        if ( entity.getReason() != null ) {
            pimByzzjlmxDTO.setReason( entity.getReason() );
        }
        if ( entity.getFinished() != null ) {
            pimByzzjlmxDTO.setFinished( entity.getFinished() );
        }
        if ( entity.getYzbm() != null ) {
            pimByzzjlmxDTO.setYzbm( entity.getYzbm() );
        }
        if ( entity.getCheckstatus() != null ) {
            pimByzzjlmxDTO.setCheckstatus( entity.getCheckstatus() );
        }
        if ( entity.getCz() != null ) {
            pimByzzjlmxDTO.setCz( entity.getCz() );
        }
        if ( entity.getXygbh() != null ) {
            pimByzzjlmxDTO.setXygbh( entity.getXygbh() );
        }
        if ( entity.getOldyglx() != null ) {
            pimByzzjlmxDTO.setOldyglx( entity.getOldyglx() );
        }
        if ( entity.getJzbshyj() != null ) {
            pimByzzjlmxDTO.setJzbshyj( entity.getJzbshyj() );
        }
        if ( entity.getSslwgsdz() != null ) {
            pimByzzjlmxDTO.setSslwgsdz( entity.getSslwgsdz() );
        }
        if ( entity.getJsrq() != null ) {
            pimByzzjlmxDTO.setJsrq( entity.getJsrq() );
        }
        if ( entity.getJzpspyj() != null ) {
            pimByzzjlmxDTO.setJzpspyj( entity.getJzpspyj() );
        }
        if ( entity.getSxrq() != null ) {
            pimByzzjlmxDTO.setSxrq( entity.getSxrq() );
        }
        if ( entity.getProfilelist() != null ) {
            pimByzzjlmxDTO.setProfilelist( entity.getProfilelist() );
        }
        if ( entity.getTjqk() != null ) {
            pimByzzjlmxDTO.setTjqk( entity.getTjqk() );
        }
        if ( entity.getYwzdjbs() != null ) {
            pimByzzjlmxDTO.setYwzdjbs( entity.getYwzdjbs() );
        }
        if ( entity.getSbcl() != null ) {
            pimByzzjlmxDTO.setSbcl( entity.getSbcl() );
        }
        if ( entity.getJzbspyj() != null ) {
            pimByzzjlmxDTO.setJzbspyj( entity.getJzbspyj() );
        }
        if ( entity.getQsrq() != null ) {
            pimByzzjlmxDTO.setQsrq( entity.getQsrq() );
        }
        if ( entity.getOldygbh() != null ) {
            pimByzzjlmxDTO.setOldygbh( entity.getOldygbh() );
        }
        if ( entity.getDatzqk() != null ) {
            pimByzzjlmxDTO.setDatzqk( entity.getDatzqk() );
        }
        if ( entity.getZtyy() != null ) {
            pimByzzjlmxDTO.setZtyy( entity.getZtyy() );
        }
        if ( entity.getStandardcause() != null ) {
            pimByzzjlmxDTO.setStandardcause( entity.getStandardcause() );
        }
        if ( entity.getPimbyzzjlmxname() != null ) {
            pimByzzjlmxDTO.setPimbyzzjlmxname( entity.getPimbyzzjlmxname() );
        }
        if ( entity.getPeoplenum() != null ) {
            pimByzzjlmxDTO.setPeoplenum( entity.getPeoplenum() );
        }
        if ( entity.getYgbh() != null ) {
            pimByzzjlmxDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getBmid() != null ) {
            pimByzzjlmxDTO.setBmid( entity.getBmid() );
        }
        if ( entity.getBm() != null ) {
            pimByzzjlmxDTO.setBm( entity.getBm() );
        }
        if ( entity.getFs() != null ) {
            pimByzzjlmxDTO.setFs( entity.getFs() );
        }
        if ( entity.getYyglx() != null ) {
            pimByzzjlmxDTO.setYyglx( entity.getYyglx() );
        }
        if ( entity.getYbhqysj() != null ) {
            pimByzzjlmxDTO.setYbhqysj( entity.getYbhqysj() );
        }
        if ( entity.getPj() != null ) {
            pimByzzjlmxDTO.setPj( entity.getPj() );
        }
        if ( entity.getZz() != null ) {
            pimByzzjlmxDTO.setZz( entity.getZz() );
        }
        if ( entity.getZzid() != null ) {
            pimByzzjlmxDTO.setZzid( entity.getZzid() );
        }
        if ( entity.getPimpersonid() != null ) {
            pimByzzjlmxDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getPimexaminationresultsid() != null ) {
            pimByzzjlmxDTO.setPimexaminationresultsid( entity.getPimexaminationresultsid() );
        }
        if ( entity.getPimbyygzzsqid() != null ) {
            pimByzzjlmxDTO.setPimbyygzzsqid( entity.getPimbyygzzsqid() );
        }
        if ( entity.getOrmpostid() != null ) {
            pimByzzjlmxDTO.setOrmpostid( entity.getOrmpostid() );
        }
        if ( entity.getOrgid() != null ) {
            pimByzzjlmxDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getOrgsectorid() != null ) {
            pimByzzjlmxDTO.setOrgsectorid( entity.getOrgsectorid() );
        }
        if ( entity.getCreatedate() != null ) {
            pimByzzjlmxDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getDqzt() != null ) {
            pimByzzjlmxDTO.setDqzt( entity.getDqzt() );
        }
        if ( entity.getYj() != null ) {
            pimByzzjlmxDTO.setYj( entity.getYj() );
        }
        if ( entity.getCreateman() != null ) {
            pimByzzjlmxDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimByzzjlmxDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            pimByzzjlmxDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getPimbyzzjlmxid() != null ) {
            pimByzzjlmxDTO.setPimbyzzjlmxid( entity.getPimbyzzjlmxid() );
        }
        if ( entity.getCjgzsj() != null ) {
            pimByzzjlmxDTO.setCjgzsj( entity.getCjgzsj() );
        }
        if ( entity.getYgw() != null ) {
            pimByzzjlmxDTO.setYgw( entity.getYgw() );
        }
        if ( entity.getOrmpostname() != null ) {
            pimByzzjlmxDTO.setOrmpostname( entity.getOrmpostname() );
        }
        if ( entity.getXb() != null ) {
            pimByzzjlmxDTO.setXb( entity.getXb() );
        }
        if ( entity.getHklx() != null ) {
            pimByzzjlmxDTO.setHklx( entity.getHklx() );
        }
        if ( entity.getLxdh() != null ) {
            pimByzzjlmxDTO.setLxdh( entity.getLxdh() );
        }
        if ( entity.getPimexaminationresultsname() != null ) {
            pimByzzjlmxDTO.setPimexaminationresultsname( entity.getPimexaminationresultsname() );
        }
        if ( entity.getHightitle() != null ) {
            pimByzzjlmxDTO.setHightitle( entity.getHightitle() );
        }
        if ( entity.getPostaladdress() != null ) {
            pimByzzjlmxDTO.setPostaladdress( entity.getPostaladdress() );
        }
        if ( entity.getHjdz() != null ) {
            pimByzzjlmxDTO.setHjdz( entity.getHjdz() );
        }
        if ( entity.getZjhm() != null ) {
            pimByzzjlmxDTO.setZjhm( entity.getZjhm() );
        }
        if ( entity.getDzjbjsj() != null ) {
            pimByzzjlmxDTO.setDzjbjsj( entity.getDzjbjsj() );
        }
        if ( entity.getPimpersonname() != null ) {
            pimByzzjlmxDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getJg() != null ) {
            pimByzzjlmxDTO.setJg( entity.getJg() );
        }
        if ( entity.getZzmm() != null ) {
            pimByzzjlmxDTO.setZzmm( entity.getZzmm() );
        }
        if ( entity.getQssj() != null ) {
            pimByzzjlmxDTO.setQssj( entity.getQssj() );
        }
        if ( entity.getPimbyygzzsqname() != null ) {
            pimByzzjlmxDTO.setPimbyygzzsqname( entity.getPimbyygzzsqname() );
        }
        if ( entity.getCsrq() != null ) {
            pimByzzjlmxDTO.setCsrq( entity.getCsrq() );
        }
        if ( entity.getJssj() != null ) {
            pimByzzjlmxDTO.setJssj( entity.getJssj() );
        }
        if ( entity.getJkzk() != null ) {
            pimByzzjlmxDTO.setJkzk( entity.getJkzk() );
        }
        if ( entity.getMz() != null ) {
            pimByzzjlmxDTO.setMz( entity.getMz() );
        }

        return pimByzzjlmxDTO;
    }

    @Override
    public List<PimByzzjlmx> toDomain(List<PimByzzjlmxDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimByzzjlmx> list = new ArrayList<PimByzzjlmx>( dtoList.size() );
        for ( PimByzzjlmxDTO pimByzzjlmxDTO : dtoList ) {
            list.add( toDomain( pimByzzjlmxDTO ) );
        }

        return list;
    }

    @Override
    public List<PimByzzjlmxDTO> toDto(List<PimByzzjlmx> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimByzzjlmxDTO> list = new ArrayList<PimByzzjlmxDTO>( entityList.size() );
        for ( PimByzzjlmx pimByzzjlmx : entityList ) {
            list.add( toDto( pimByzzjlmx ) );
        }

        return list;
    }
}
