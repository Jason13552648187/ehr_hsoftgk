package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.vac.domain.VacLeaveSystem;
import cn.ibizlab.ehr.webapi.dto.VacLeaveSystemDTO;
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
    date = "2021-09-04T00:31:52+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class VacLeaveSystemMappingImpl implements VacLeaveSystemMapping {

    @Override
    public VacLeaveSystem toDomain(VacLeaveSystemDTO dto) {
        if ( dto == null ) {
            return null;
        }

        VacLeaveSystem vacLeaveSystem = new VacLeaveSystem();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            vacLeaveSystem.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            vacLeaveSystem.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getYxqjs() != null ) {
            vacLeaveSystem.setYxqjs( dto.getYxqjs() );
        }
        if ( dto.getBz() != null ) {
            vacLeaveSystem.setBz( dto.getBz() );
        }
        if ( dto.getVacleavesystemname() != null ) {
            vacLeaveSystem.setVacleavesystemname( dto.getVacleavesystemname() );
        }
        if ( dto.getSfqy() != null ) {
            vacLeaveSystem.setSfqy( dto.getSfqy() );
        }
        if ( dto.getNd() != null ) {
            vacLeaveSystem.setNd( dto.getNd() );
        }
        if ( dto.getYxqks() != null ) {
            vacLeaveSystem.setYxqks( dto.getYxqks() );
        }
        if ( dto.getOrmorgid() != null ) {
            vacLeaveSystem.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getUpdatedate() != null ) {
            vacLeaveSystem.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            vacLeaveSystem.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            vacLeaveSystem.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getVacleavesystemid() != null ) {
            vacLeaveSystem.setVacleavesystemid( dto.getVacleavesystemid() );
        }
        if ( dto.getOrgid() != null ) {
            vacLeaveSystem.setOrgid( dto.getOrgid() );
        }
        if ( dto.getUpdateman() != null ) {
            vacLeaveSystem.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getEnable() != null ) {
            vacLeaveSystem.setEnable( dto.getEnable() );
        }
        if ( dto.getOrmorgname() != null ) {
            vacLeaveSystem.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getZzdzs() != null ) {
            vacLeaveSystem.setZzdzs( dto.getZzdzs() );
        }

        return vacLeaveSystem;
    }

    @Override
    public VacLeaveSystemDTO toDto(VacLeaveSystem entity) {
        if ( entity == null ) {
            return null;
        }

        VacLeaveSystemDTO vacLeaveSystemDTO = new VacLeaveSystemDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            vacLeaveSystemDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            vacLeaveSystemDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getYxqjs() != null ) {
            vacLeaveSystemDTO.setYxqjs( entity.getYxqjs() );
        }
        if ( entity.getBz() != null ) {
            vacLeaveSystemDTO.setBz( entity.getBz() );
        }
        if ( entity.getVacleavesystemname() != null ) {
            vacLeaveSystemDTO.setVacleavesystemname( entity.getVacleavesystemname() );
        }
        if ( entity.getSfqy() != null ) {
            vacLeaveSystemDTO.setSfqy( entity.getSfqy() );
        }
        if ( entity.getNd() != null ) {
            vacLeaveSystemDTO.setNd( entity.getNd() );
        }
        if ( entity.getYxqks() != null ) {
            vacLeaveSystemDTO.setYxqks( entity.getYxqks() );
        }
        if ( entity.getOrmorgid() != null ) {
            vacLeaveSystemDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getUpdatedate() != null ) {
            vacLeaveSystemDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            vacLeaveSystemDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            vacLeaveSystemDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getVacleavesystemid() != null ) {
            vacLeaveSystemDTO.setVacleavesystemid( entity.getVacleavesystemid() );
        }
        if ( entity.getOrgid() != null ) {
            vacLeaveSystemDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getUpdateman() != null ) {
            vacLeaveSystemDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getEnable() != null ) {
            vacLeaveSystemDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getOrmorgname() != null ) {
            vacLeaveSystemDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getZzdzs() != null ) {
            vacLeaveSystemDTO.setZzdzs( entity.getZzdzs() );
        }

        return vacLeaveSystemDTO;
    }

    @Override
    public List<VacLeaveSystem> toDomain(List<VacLeaveSystemDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<VacLeaveSystem> list = new ArrayList<VacLeaveSystem>( dtoList.size() );
        for ( VacLeaveSystemDTO vacLeaveSystemDTO : dtoList ) {
            list.add( toDomain( vacLeaveSystemDTO ) );
        }

        return list;
    }

    @Override
    public List<VacLeaveSystemDTO> toDto(List<VacLeaveSystem> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<VacLeaveSystemDTO> list = new ArrayList<VacLeaveSystemDTO>( entityList.size() );
        for ( VacLeaveSystem vacLeaveSystem : entityList ) {
            list.add( toDto( vacLeaveSystem ) );
        }

        return list;
    }
}
