package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmMonth;
import cn.ibizlab.ehr.webapi.dto.PcmMonthDTO;
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
    date = "2021-09-04T00:31:50+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmMonthMappingImpl implements PcmMonthMapping {

    @Override
    public PcmMonth toDomain(PcmMonthDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmMonth pcmMonth = new PcmMonth();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmMonth.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmMonth.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getPcmmonthname() != null ) {
            pcmMonth.setPcmmonthname( dto.getPcmmonthname() );
        }
        if ( dto.getPcmmonthid() != null ) {
            pcmMonth.setPcmmonthid( dto.getPcmmonthid() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmMonth.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmMonth.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getCreateman() != null ) {
            pcmMonth.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmMonth.setUpdatedate( dto.getUpdatedate() );
        }

        return pcmMonth;
    }

    @Override
    public PcmMonthDTO toDto(PcmMonth entity) {
        if ( entity == null ) {
            return null;
        }

        PcmMonthDTO pcmMonthDTO = new PcmMonthDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmMonthDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmMonthDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getPcmmonthname() != null ) {
            pcmMonthDTO.setPcmmonthname( entity.getPcmmonthname() );
        }
        if ( entity.getPcmmonthid() != null ) {
            pcmMonthDTO.setPcmmonthid( entity.getPcmmonthid() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmMonthDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmMonthDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getCreateman() != null ) {
            pcmMonthDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmMonthDTO.setUpdatedate( entity.getUpdatedate() );
        }

        return pcmMonthDTO;
    }

    @Override
    public List<PcmMonth> toDomain(List<PcmMonthDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmMonth> list = new ArrayList<PcmMonth>( dtoList.size() );
        for ( PcmMonthDTO pcmMonthDTO : dtoList ) {
            list.add( toDomain( pcmMonthDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmMonthDTO> toDto(List<PcmMonth> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmMonthDTO> list = new ArrayList<PcmMonthDTO>( entityList.size() );
        for ( PcmMonth pcmMonth : entityList ) {
            list.add( toDto( pcmMonth ) );
        }

        return list;
    }
}
