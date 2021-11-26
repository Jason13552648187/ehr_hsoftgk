package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.r7rt_dyna.domain.DynaDashboard;
import cn.ibizlab.ehr.webapi.dto.DynaDashboardDTO;
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
public class DynaDashboardMappingImpl implements DynaDashboardMapping {

    @Override
    public DynaDashboard toDomain(DynaDashboardDTO dto) {
        if ( dto == null ) {
            return null;
        }

        DynaDashboard dynaDashboard = new DynaDashboard();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            dynaDashboard.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            dynaDashboard.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getUserid() != null ) {
            dynaDashboard.setUserid( dto.getUserid() );
        }
        if ( dto.getDynadashboardname() != null ) {
            dynaDashboard.setDynadashboardname( dto.getDynadashboardname() );
        }
        if ( dto.getModelid() != null ) {
            dynaDashboard.setModelid( dto.getModelid() );
        }
        if ( dto.getAppid() != null ) {
            dynaDashboard.setAppid( dto.getAppid() );
        }
        if ( dto.getModel() != null ) {
            dynaDashboard.setModel( dto.getModel() );
        }
        if ( dto.getDynadashboardid() != null ) {
            dynaDashboard.setDynadashboardid( dto.getDynadashboardid() );
        }
        if ( dto.getCreateman() != null ) {
            dynaDashboard.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdateman() != null ) {
            dynaDashboard.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            dynaDashboard.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreatedate() != null ) {
            dynaDashboard.setCreatedate( dto.getCreatedate() );
        }

        return dynaDashboard;
    }

    @Override
    public DynaDashboardDTO toDto(DynaDashboard entity) {
        if ( entity == null ) {
            return null;
        }

        DynaDashboardDTO dynaDashboardDTO = new DynaDashboardDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            dynaDashboardDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            dynaDashboardDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getUserid() != null ) {
            dynaDashboardDTO.setUserid( entity.getUserid() );
        }
        if ( entity.getDynadashboardname() != null ) {
            dynaDashboardDTO.setDynadashboardname( entity.getDynadashboardname() );
        }
        if ( entity.getModelid() != null ) {
            dynaDashboardDTO.setModelid( entity.getModelid() );
        }
        if ( entity.getAppid() != null ) {
            dynaDashboardDTO.setAppid( entity.getAppid() );
        }
        if ( entity.getModel() != null ) {
            dynaDashboardDTO.setModel( entity.getModel() );
        }
        if ( entity.getDynadashboardid() != null ) {
            dynaDashboardDTO.setDynadashboardid( entity.getDynadashboardid() );
        }
        if ( entity.getCreateman() != null ) {
            dynaDashboardDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdateman() != null ) {
            dynaDashboardDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            dynaDashboardDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreatedate() != null ) {
            dynaDashboardDTO.setCreatedate( entity.getCreatedate() );
        }

        return dynaDashboardDTO;
    }

    @Override
    public List<DynaDashboard> toDomain(List<DynaDashboardDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<DynaDashboard> list = new ArrayList<DynaDashboard>( dtoList.size() );
        for ( DynaDashboardDTO dynaDashboardDTO : dtoList ) {
            list.add( toDomain( dynaDashboardDTO ) );
        }

        return list;
    }

    @Override
    public List<DynaDashboardDTO> toDto(List<DynaDashboard> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<DynaDashboardDTO> list = new ArrayList<DynaDashboardDTO>( entityList.size() );
        for ( DynaDashboard dynaDashboard : entityList ) {
            list.add( toDto( dynaDashboard ) );
        }

        return list;
    }
}
