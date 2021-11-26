package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimEducation;
import cn.ibizlab.ehr.webapi.dto.PimEducationDTO;
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
    date = "2021-09-04T00:31:53+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PimEducationMappingImpl implements PimEducationMapping {

    @Override
    public PimEducation toDomain(PimEducationDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimEducation pimEducation = new PimEducation();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimEducation.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimEducation.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getBdwgznx() != null ) {
            pimEducation.setBdwgznx( dto.getBdwgznx() );
        }
        if ( dto.getReason() != null ) {
            pimEducation.setReason( dto.getReason() );
        }
        if ( dto.getSfdyxl() != null ) {
            pimEducation.setSfdyxl( dto.getSfdyxl() );
        }
        if ( dto.getJlczz() != null ) {
            pimEducation.setJlczz( dto.getJlczz() );
        }
        if ( dto.getBz() != null ) {
            pimEducation.setBz( dto.getBz() );
        }
        if ( dto.getJymc() != null ) {
            pimEducation.setJymc( dto.getJymc() );
        }
        if ( dto.getXkml() != null ) {
            pimEducation.setXkml( dto.getXkml() );
        }
        if ( dto.getCjgzsj() != null ) {
            pimEducation.setCjgzsj( dto.getCjgzsj() );
        }
        if ( dto.getSxzy() != null ) {
            pimEducation.setSxzy( dto.getSxzy() );
        }
        if ( dto.getJssj() != null ) {
            pimEducation.setJssj( dto.getJssj() );
        }
        if ( dto.getDzjbjsj() != null ) {
            pimEducation.setDzjbjsj( dto.getDzjbjsj() );
        }
        if ( dto.getDegree() != null ) {
            pimEducation.setDegree( dto.getDegree() );
        }
        if ( dto.getXwz() != null ) {
            pimEducation.setXwz( dto.getXwz() );
        }
        if ( dto.getXllx() != null ) {
            pimEducation.setXllx( dto.getXllx() );
        }
        if ( dto.getXxxz() != null ) {
            pimEducation.setXxxz( dto.getXxxz() );
        }
        if ( dto.getTozjdate() != null ) {
            pimEducation.setTozjdate( dto.getTozjdate() );
        }
        if ( dto.getJlglbh() != null ) {
            pimEducation.setJlglbh( dto.getJlglbh() );
        }
        if ( dto.getJlspzt() != null ) {
            pimEducation.setJlspzt( dto.getJlspzt() );
        }
        if ( dto.getBtz() != null ) {
            pimEducation.setBtz( dto.getBtz() );
        }
        if ( dto.getXlcx() != null ) {
            pimEducation.setXlcx( dto.getXlcx() );
        }
        if ( dto.getPimeducationname() != null ) {
            pimEducation.setPimeducationname( dto.getPimeducationname() );
        }
        if ( dto.getByyx() != null ) {
            pimEducation.setByyx( dto.getByyx() );
        }
        if ( dto.getQssj() != null ) {
            pimEducation.setQssj( dto.getQssj() );
        }
        if ( dto.getGznx() != null ) {
            pimEducation.setGznx( dto.getGznx() );
        }
        if ( dto.getJlss() != null ) {
            pimEducation.setJlss( dto.getJlss() );
        }
        if ( dto.getFj() != null ) {
            pimEducation.setFj( dto.getFj() );
        }
        if ( dto.getSfzgxl() != null ) {
            pimEducation.setSfzgxl( dto.getSfzgxl() );
        }
        if ( dto.getXl() != null ) {
            pimEducation.setXl( dto.getXl() );
        }
        if ( dto.getDbdwsj() != null ) {
            pimEducation.setDbdwsj( dto.getDbdwsj() );
        }
        if ( dto.getZjxtgznx() != null ) {
            pimEducation.setZjxtgznx( dto.getZjxtgznx() );
        }
        if ( dto.getBjgznx() != null ) {
            pimEducation.setBjgznx( dto.getBjgznx() );
        }
        if ( dto.getYgbh() != null ) {
            pimEducation.setYgbh( dto.getYgbh() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            pimEducation.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getPimpersonid() != null ) {
            pimEducation.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getOrgsectorid() != null ) {
            pimEducation.setOrgsectorid( dto.getOrgsectorid() );
        }
        if ( dto.getPimeducationid() != null ) {
            pimEducation.setPimeducationid( dto.getPimeducationid() );
        }
        if ( dto.getEnable() != null ) {
            pimEducation.setEnable( dto.getEnable() );
        }
        if ( dto.getCreateman() != null ) {
            pimEducation.setCreateman( dto.getCreateman() );
        }
        if ( dto.getSpstate() != null ) {
            pimEducation.setSpstate( dto.getSpstate() );
        }
        if ( dto.getUpdateman() != null ) {
            pimEducation.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimEducation.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getOrgid() != null ) {
            pimEducation.setOrgid( dto.getOrgid() );
        }
        if ( dto.getCreatedate() != null ) {
            pimEducation.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getOrmorgid() != null ) {
            pimEducation.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getPimpersonname() != null ) {
            pimEducation.setPimpersonname( dto.getPimpersonname() );
        }

        return pimEducation;
    }

    @Override
    public PimEducationDTO toDto(PimEducation entity) {
        if ( entity == null ) {
            return null;
        }

        PimEducationDTO pimEducationDTO = new PimEducationDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimEducationDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimEducationDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getBdwgznx() != null ) {
            pimEducationDTO.setBdwgznx( entity.getBdwgznx() );
        }
        if ( entity.getReason() != null ) {
            pimEducationDTO.setReason( entity.getReason() );
        }
        if ( entity.getSfdyxl() != null ) {
            pimEducationDTO.setSfdyxl( entity.getSfdyxl() );
        }
        if ( entity.getJlczz() != null ) {
            pimEducationDTO.setJlczz( entity.getJlczz() );
        }
        if ( entity.getBz() != null ) {
            pimEducationDTO.setBz( entity.getBz() );
        }
        if ( entity.getJymc() != null ) {
            pimEducationDTO.setJymc( entity.getJymc() );
        }
        if ( entity.getXkml() != null ) {
            pimEducationDTO.setXkml( entity.getXkml() );
        }
        if ( entity.getCjgzsj() != null ) {
            pimEducationDTO.setCjgzsj( entity.getCjgzsj() );
        }
        if ( entity.getSxzy() != null ) {
            pimEducationDTO.setSxzy( entity.getSxzy() );
        }
        if ( entity.getJssj() != null ) {
            pimEducationDTO.setJssj( entity.getJssj() );
        }
        if ( entity.getDzjbjsj() != null ) {
            pimEducationDTO.setDzjbjsj( entity.getDzjbjsj() );
        }
        if ( entity.getDegree() != null ) {
            pimEducationDTO.setDegree( entity.getDegree() );
        }
        if ( entity.getXwz() != null ) {
            pimEducationDTO.setXwz( entity.getXwz() );
        }
        if ( entity.getXllx() != null ) {
            pimEducationDTO.setXllx( entity.getXllx() );
        }
        if ( entity.getXxxz() != null ) {
            pimEducationDTO.setXxxz( entity.getXxxz() );
        }
        if ( entity.getTozjdate() != null ) {
            pimEducationDTO.setTozjdate( entity.getTozjdate() );
        }
        if ( entity.getJlglbh() != null ) {
            pimEducationDTO.setJlglbh( entity.getJlglbh() );
        }
        if ( entity.getJlspzt() != null ) {
            pimEducationDTO.setJlspzt( entity.getJlspzt() );
        }
        if ( entity.getBtz() != null ) {
            pimEducationDTO.setBtz( entity.getBtz() );
        }
        if ( entity.getXlcx() != null ) {
            pimEducationDTO.setXlcx( entity.getXlcx() );
        }
        if ( entity.getPimeducationname() != null ) {
            pimEducationDTO.setPimeducationname( entity.getPimeducationname() );
        }
        if ( entity.getByyx() != null ) {
            pimEducationDTO.setByyx( entity.getByyx() );
        }
        if ( entity.getQssj() != null ) {
            pimEducationDTO.setQssj( entity.getQssj() );
        }
        if ( entity.getGznx() != null ) {
            pimEducationDTO.setGznx( entity.getGznx() );
        }
        if ( entity.getJlss() != null ) {
            pimEducationDTO.setJlss( entity.getJlss() );
        }
        if ( entity.getFj() != null ) {
            pimEducationDTO.setFj( entity.getFj() );
        }
        if ( entity.getSfzgxl() != null ) {
            pimEducationDTO.setSfzgxl( entity.getSfzgxl() );
        }
        if ( entity.getXl() != null ) {
            pimEducationDTO.setXl( entity.getXl() );
        }
        if ( entity.getDbdwsj() != null ) {
            pimEducationDTO.setDbdwsj( entity.getDbdwsj() );
        }
        if ( entity.getZjxtgznx() != null ) {
            pimEducationDTO.setZjxtgznx( entity.getZjxtgznx() );
        }
        if ( entity.getBjgznx() != null ) {
            pimEducationDTO.setBjgznx( entity.getBjgznx() );
        }
        if ( entity.getYgbh() != null ) {
            pimEducationDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            pimEducationDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getPimpersonid() != null ) {
            pimEducationDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getOrgsectorid() != null ) {
            pimEducationDTO.setOrgsectorid( entity.getOrgsectorid() );
        }
        if ( entity.getPimeducationid() != null ) {
            pimEducationDTO.setPimeducationid( entity.getPimeducationid() );
        }
        if ( entity.getEnable() != null ) {
            pimEducationDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getCreateman() != null ) {
            pimEducationDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getSpstate() != null ) {
            pimEducationDTO.setSpstate( entity.getSpstate() );
        }
        if ( entity.getUpdateman() != null ) {
            pimEducationDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimEducationDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getOrgid() != null ) {
            pimEducationDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getCreatedate() != null ) {
            pimEducationDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getOrmorgid() != null ) {
            pimEducationDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getPimpersonname() != null ) {
            pimEducationDTO.setPimpersonname( entity.getPimpersonname() );
        }

        return pimEducationDTO;
    }

    @Override
    public List<PimEducation> toDomain(List<PimEducationDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimEducation> list = new ArrayList<PimEducation>( dtoList.size() );
        for ( PimEducationDTO pimEducationDTO : dtoList ) {
            list.add( toDomain( pimEducationDTO ) );
        }

        return list;
    }

    @Override
    public List<PimEducationDTO> toDto(List<PimEducation> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimEducationDTO> list = new ArrayList<PimEducationDTO>( entityList.size() );
        for ( PimEducation pimEducation : entityList ) {
            list.add( toDto( pimEducation ) );
        }

        return list;
    }
}
