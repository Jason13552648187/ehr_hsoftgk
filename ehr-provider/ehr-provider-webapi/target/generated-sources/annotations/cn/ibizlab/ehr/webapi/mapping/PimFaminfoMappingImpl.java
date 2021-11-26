package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimFaminfo;
import cn.ibizlab.ehr.webapi.dto.PimFaminfoDTO;
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
    date = "2021-09-04T00:31:51+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PimFaminfoMappingImpl implements PimFaminfoMapping {

    @Override
    public PimFaminfo toDomain(PimFaminfoDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimFaminfo pimFaminfo = new PimFaminfo();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimFaminfo.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimFaminfo.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getJlss() != null ) {
            pimFaminfo.setJlss( dto.getJlss() );
        }
        if ( dto.getZjh() != null ) {
            pimFaminfo.setZjh( dto.getZjh() );
        }
        if ( dto.getNl() != null ) {
            pimFaminfo.setNl( dto.getNl() );
        }
        if ( dto.getSfjjllr() != null ) {
            pimFaminfo.setSfjjllr( dto.getSfjjllr() );
        }
        if ( dto.getZzmm() != null ) {
            pimFaminfo.setZzmm( dto.getZzmm() );
        }
        if ( dto.getJlglbh() != null ) {
            pimFaminfo.setJlglbh( dto.getJlglbh() );
        }
        if ( dto.getZw() != null ) {
            pimFaminfo.setZw( dto.getZw() );
        }
        if ( dto.getPimfaminfoname() != null ) {
            pimFaminfo.setPimfaminfoname( dto.getPimfaminfoname() );
        }
        if ( dto.getZjlx() != null ) {
            pimFaminfo.setZjlx( dto.getZjlx() );
        }
        if ( dto.getCsrq() != null ) {
            pimFaminfo.setCsrq( dto.getCsrq() );
        }
        if ( dto.getSruvivors() != null ) {
            pimFaminfo.setSruvivors( dto.getSruvivors() );
        }
        if ( dto.getYbrgx() != null ) {
            pimFaminfo.setYbrgx( dto.getYbrgx() );
        }
        if ( dto.getGzdw() != null ) {
            pimFaminfo.setGzdw( dto.getGzdw() );
        }
        if ( dto.getXb() != null ) {
            pimFaminfo.setXb( dto.getXb() );
        }
        if ( dto.getJlczz() != null ) {
            pimFaminfo.setJlczz( dto.getJlczz() );
        }
        if ( dto.getReason() != null ) {
            pimFaminfo.setReason( dto.getReason() );
        }
        if ( dto.getJlspzt() != null ) {
            pimFaminfo.setJlspzt( dto.getJlspzt() );
        }
        if ( dto.getTelphone() != null ) {
            pimFaminfo.setTelphone( dto.getTelphone() );
        }
        if ( dto.getPimpersonid() != null ) {
            pimFaminfo.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getOrgsectorid() != null ) {
            pimFaminfo.setOrgsectorid( dto.getOrgsectorid() );
        }
        if ( dto.getCreatedate() != null ) {
            pimFaminfo.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getCreateman() != null ) {
            pimFaminfo.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimFaminfo.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getSpstate() != null ) {
            pimFaminfo.setSpstate( dto.getSpstate() );
        }
        if ( dto.getOrgid() != null ) {
            pimFaminfo.setOrgid( dto.getOrgid() );
        }
        if ( dto.getPimfaminfoid() != null ) {
            pimFaminfo.setPimfaminfoid( dto.getPimfaminfoid() );
        }
        if ( dto.getNj() != null ) {
            pimFaminfo.setNj( dto.getNj() );
        }
        if ( dto.getEnable() != null ) {
            pimFaminfo.setEnable( dto.getEnable() );
        }
        if ( dto.getUpdateman() != null ) {
            pimFaminfo.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getOrmorgid() != null ) {
            pimFaminfo.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            pimFaminfo.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getYgbh() != null ) {
            pimFaminfo.setYgbh( dto.getYgbh() );
        }
        if ( dto.getPimpersonname() != null ) {
            pimFaminfo.setPimpersonname( dto.getPimpersonname() );
        }

        return pimFaminfo;
    }

    @Override
    public PimFaminfoDTO toDto(PimFaminfo entity) {
        if ( entity == null ) {
            return null;
        }

        PimFaminfoDTO pimFaminfoDTO = new PimFaminfoDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimFaminfoDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimFaminfoDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getJlss() != null ) {
            pimFaminfoDTO.setJlss( entity.getJlss() );
        }
        if ( entity.getZjh() != null ) {
            pimFaminfoDTO.setZjh( entity.getZjh() );
        }
        if ( entity.getNl() != null ) {
            pimFaminfoDTO.setNl( entity.getNl() );
        }
        if ( entity.getSfjjllr() != null ) {
            pimFaminfoDTO.setSfjjllr( entity.getSfjjllr() );
        }
        if ( entity.getZzmm() != null ) {
            pimFaminfoDTO.setZzmm( entity.getZzmm() );
        }
        if ( entity.getJlglbh() != null ) {
            pimFaminfoDTO.setJlglbh( entity.getJlglbh() );
        }
        if ( entity.getZw() != null ) {
            pimFaminfoDTO.setZw( entity.getZw() );
        }
        if ( entity.getPimfaminfoname() != null ) {
            pimFaminfoDTO.setPimfaminfoname( entity.getPimfaminfoname() );
        }
        if ( entity.getZjlx() != null ) {
            pimFaminfoDTO.setZjlx( entity.getZjlx() );
        }
        if ( entity.getCsrq() != null ) {
            pimFaminfoDTO.setCsrq( entity.getCsrq() );
        }
        if ( entity.getSruvivors() != null ) {
            pimFaminfoDTO.setSruvivors( entity.getSruvivors() );
        }
        if ( entity.getYbrgx() != null ) {
            pimFaminfoDTO.setYbrgx( entity.getYbrgx() );
        }
        if ( entity.getGzdw() != null ) {
            pimFaminfoDTO.setGzdw( entity.getGzdw() );
        }
        if ( entity.getXb() != null ) {
            pimFaminfoDTO.setXb( entity.getXb() );
        }
        if ( entity.getJlczz() != null ) {
            pimFaminfoDTO.setJlczz( entity.getJlczz() );
        }
        if ( entity.getReason() != null ) {
            pimFaminfoDTO.setReason( entity.getReason() );
        }
        if ( entity.getJlspzt() != null ) {
            pimFaminfoDTO.setJlspzt( entity.getJlspzt() );
        }
        if ( entity.getTelphone() != null ) {
            pimFaminfoDTO.setTelphone( entity.getTelphone() );
        }
        if ( entity.getPimpersonid() != null ) {
            pimFaminfoDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getOrgsectorid() != null ) {
            pimFaminfoDTO.setOrgsectorid( entity.getOrgsectorid() );
        }
        if ( entity.getCreatedate() != null ) {
            pimFaminfoDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getCreateman() != null ) {
            pimFaminfoDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimFaminfoDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getSpstate() != null ) {
            pimFaminfoDTO.setSpstate( entity.getSpstate() );
        }
        if ( entity.getOrgid() != null ) {
            pimFaminfoDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getPimfaminfoid() != null ) {
            pimFaminfoDTO.setPimfaminfoid( entity.getPimfaminfoid() );
        }
        if ( entity.getNj() != null ) {
            pimFaminfoDTO.setNj( entity.getNj() );
        }
        if ( entity.getEnable() != null ) {
            pimFaminfoDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getUpdateman() != null ) {
            pimFaminfoDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getOrmorgid() != null ) {
            pimFaminfoDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            pimFaminfoDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getYgbh() != null ) {
            pimFaminfoDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getPimpersonname() != null ) {
            pimFaminfoDTO.setPimpersonname( entity.getPimpersonname() );
        }

        return pimFaminfoDTO;
    }

    @Override
    public List<PimFaminfo> toDomain(List<PimFaminfoDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimFaminfo> list = new ArrayList<PimFaminfo>( dtoList.size() );
        for ( PimFaminfoDTO pimFaminfoDTO : dtoList ) {
            list.add( toDomain( pimFaminfoDTO ) );
        }

        return list;
    }

    @Override
    public List<PimFaminfoDTO> toDto(List<PimFaminfo> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimFaminfoDTO> list = new ArrayList<PimFaminfoDTO>( entityList.size() );
        for ( PimFaminfo pimFaminfo : entityList ) {
            list.add( toDto( pimFaminfo ) );
        }

        return list;
    }
}
