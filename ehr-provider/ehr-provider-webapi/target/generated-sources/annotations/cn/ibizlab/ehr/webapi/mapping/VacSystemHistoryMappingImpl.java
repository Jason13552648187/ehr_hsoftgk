package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.vac.domain.VacSystemHistory;
import cn.ibizlab.ehr.webapi.dto.VacSystemHistoryDTO;
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
public class VacSystemHistoryMappingImpl implements VacSystemHistoryMapping {

    @Override
    public VacSystemHistory toDomain(VacSystemHistoryDTO dto) {
        if ( dto == null ) {
            return null;
        }

        VacSystemHistory vacSystemHistory = new VacSystemHistory();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            vacSystemHistory.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            vacSystemHistory.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getVacsystemhistoryname() != null ) {
            vacSystemHistory.setVacsystemhistoryname( dto.getVacsystemhistoryname() );
        }
        if ( dto.getPimpersonid() != null ) {
            vacSystemHistory.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getVacleavesystemid() != null ) {
            vacSystemHistory.setVacleavesystemid( dto.getVacleavesystemid() );
        }
        if ( dto.getUpdatedate() != null ) {
            vacSystemHistory.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getVacsystemhistoryid() != null ) {
            vacSystemHistory.setVacsystemhistoryid( dto.getVacsystemhistoryid() );
        }
        if ( dto.getCreateman() != null ) {
            vacSystemHistory.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            vacSystemHistory.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            vacSystemHistory.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getEnable() != null ) {
            vacSystemHistory.setEnable( dto.getEnable() );
        }
        if ( dto.getVacleavesystemname() != null ) {
            vacSystemHistory.setVacleavesystemname( dto.getVacleavesystemname() );
        }
        if ( dto.getPimpersonname() != null ) {
            vacSystemHistory.setPimpersonname( dto.getPimpersonname() );
        }

        return vacSystemHistory;
    }

    @Override
    public VacSystemHistoryDTO toDto(VacSystemHistory entity) {
        if ( entity == null ) {
            return null;
        }

        VacSystemHistoryDTO vacSystemHistoryDTO = new VacSystemHistoryDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            vacSystemHistoryDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            vacSystemHistoryDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getVacsystemhistoryname() != null ) {
            vacSystemHistoryDTO.setVacsystemhistoryname( entity.getVacsystemhistoryname() );
        }
        if ( entity.getPimpersonid() != null ) {
            vacSystemHistoryDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getVacleavesystemid() != null ) {
            vacSystemHistoryDTO.setVacleavesystemid( entity.getVacleavesystemid() );
        }
        if ( entity.getUpdatedate() != null ) {
            vacSystemHistoryDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getVacsystemhistoryid() != null ) {
            vacSystemHistoryDTO.setVacsystemhistoryid( entity.getVacsystemhistoryid() );
        }
        if ( entity.getCreateman() != null ) {
            vacSystemHistoryDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            vacSystemHistoryDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            vacSystemHistoryDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getEnable() != null ) {
            vacSystemHistoryDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getVacleavesystemname() != null ) {
            vacSystemHistoryDTO.setVacleavesystemname( entity.getVacleavesystemname() );
        }
        if ( entity.getPimpersonname() != null ) {
            vacSystemHistoryDTO.setPimpersonname( entity.getPimpersonname() );
        }

        return vacSystemHistoryDTO;
    }

    @Override
    public List<VacSystemHistory> toDomain(List<VacSystemHistoryDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<VacSystemHistory> list = new ArrayList<VacSystemHistory>( dtoList.size() );
        for ( VacSystemHistoryDTO vacSystemHistoryDTO : dtoList ) {
            list.add( toDomain( vacSystemHistoryDTO ) );
        }

        return list;
    }

    @Override
    public List<VacSystemHistoryDTO> toDto(List<VacSystemHistory> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<VacSystemHistoryDTO> list = new ArrayList<VacSystemHistoryDTO>( entityList.size() );
        for ( VacSystemHistory vacSystemHistory : entityList ) {
            list.add( toDto( vacSystemHistory ) );
        }

        return list;
    }
}
