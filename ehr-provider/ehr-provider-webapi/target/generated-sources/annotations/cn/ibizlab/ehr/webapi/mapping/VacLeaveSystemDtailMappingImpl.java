package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.vac.domain.VacLeaveSystemDtail;
import cn.ibizlab.ehr.webapi.dto.VacLeaveSystemDtailDTO;
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
    date = "2021-09-04T00:31:46+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class VacLeaveSystemDtailMappingImpl implements VacLeaveSystemDtailMapping {

    @Override
    public VacLeaveSystemDtail toDomain(VacLeaveSystemDtailDTO dto) {
        if ( dto == null ) {
            return null;
        }

        VacLeaveSystemDtail vacLeaveSystemDtail = new VacLeaveSystemDtail();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            vacLeaveSystemDtail.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            vacLeaveSystemDtail.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getVacleavesystemdetailname() != null ) {
            vacLeaveSystemDtail.setVacleavesystemdetailname( dto.getVacleavesystemdetailname() );
        }
        if ( dto.getXjlx() != null ) {
            vacLeaveSystemDtail.setXjlx( dto.getXjlx() );
        }
        if ( dto.getXjgz() != null ) {
            vacLeaveSystemDtail.setXjgz( dto.getXjgz() );
        }
        if ( dto.getXjgzgs() != null ) {
            vacLeaveSystemDtail.setXjgzgs( dto.getXjgzgs() );
        }
        if ( dto.getVacleavesystemid() != null ) {
            vacLeaveSystemDtail.setVacleavesystemid( dto.getVacleavesystemid() );
        }
        if ( dto.getCreatedate() != null ) {
            vacLeaveSystemDtail.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getCreateman() != null ) {
            vacLeaveSystemDtail.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdateman() != null ) {
            vacLeaveSystemDtail.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getVacleavesystemdetailid() != null ) {
            vacLeaveSystemDtail.setVacleavesystemdetailid( dto.getVacleavesystemdetailid() );
        }
        if ( dto.getEnable() != null ) {
            vacLeaveSystemDtail.setEnable( dto.getEnable() );
        }
        if ( dto.getUpdatedate() != null ) {
            vacLeaveSystemDtail.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getVacleavesystemname() != null ) {
            vacLeaveSystemDtail.setVacleavesystemname( dto.getVacleavesystemname() );
        }

        return vacLeaveSystemDtail;
    }

    @Override
    public VacLeaveSystemDtailDTO toDto(VacLeaveSystemDtail entity) {
        if ( entity == null ) {
            return null;
        }

        VacLeaveSystemDtailDTO vacLeaveSystemDtailDTO = new VacLeaveSystemDtailDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            vacLeaveSystemDtailDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            vacLeaveSystemDtailDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getVacleavesystemdetailname() != null ) {
            vacLeaveSystemDtailDTO.setVacleavesystemdetailname( entity.getVacleavesystemdetailname() );
        }
        if ( entity.getXjlx() != null ) {
            vacLeaveSystemDtailDTO.setXjlx( entity.getXjlx() );
        }
        if ( entity.getXjgz() != null ) {
            vacLeaveSystemDtailDTO.setXjgz( entity.getXjgz() );
        }
        if ( entity.getXjgzgs() != null ) {
            vacLeaveSystemDtailDTO.setXjgzgs( entity.getXjgzgs() );
        }
        if ( entity.getVacleavesystemid() != null ) {
            vacLeaveSystemDtailDTO.setVacleavesystemid( entity.getVacleavesystemid() );
        }
        if ( entity.getCreatedate() != null ) {
            vacLeaveSystemDtailDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getCreateman() != null ) {
            vacLeaveSystemDtailDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdateman() != null ) {
            vacLeaveSystemDtailDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getVacleavesystemdetailid() != null ) {
            vacLeaveSystemDtailDTO.setVacleavesystemdetailid( entity.getVacleavesystemdetailid() );
        }
        if ( entity.getEnable() != null ) {
            vacLeaveSystemDtailDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getUpdatedate() != null ) {
            vacLeaveSystemDtailDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getVacleavesystemname() != null ) {
            vacLeaveSystemDtailDTO.setVacleavesystemname( entity.getVacleavesystemname() );
        }

        return vacLeaveSystemDtailDTO;
    }

    @Override
    public List<VacLeaveSystemDtail> toDomain(List<VacLeaveSystemDtailDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<VacLeaveSystemDtail> list = new ArrayList<VacLeaveSystemDtail>( dtoList.size() );
        for ( VacLeaveSystemDtailDTO vacLeaveSystemDtailDTO : dtoList ) {
            list.add( toDomain( vacLeaveSystemDtailDTO ) );
        }

        return list;
    }

    @Override
    public List<VacLeaveSystemDtailDTO> toDto(List<VacLeaveSystemDtail> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<VacLeaveSystemDtailDTO> list = new ArrayList<VacLeaveSystemDtailDTO>( entityList.size() );
        for ( VacLeaveSystemDtail vacLeaveSystemDtail : entityList ) {
            list.add( toDto( vacLeaveSystemDtail ) );
        }

        return list;
    }
}
