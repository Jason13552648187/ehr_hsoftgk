package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmBdsqd;
import cn.ibizlab.ehr.webapi.dto.PcmBdsqdDTO;
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
public class PcmBdsqdMappingImpl implements PcmBdsqdMapping {

    @Override
    public PcmBdsqd toDomain(PcmBdsqdDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmBdsqd pcmBdsqd = new PcmBdsqd();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmBdsqd.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmBdsqd.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getBzsm() != null ) {
            pcmBdsqd.setBzsm( dto.getBzsm() );
        }
        if ( dto.getLx() != null ) {
            pcmBdsqd.setLx( dto.getLx() );
        }
        if ( dto.getPcmbdsqdname() != null ) {
            pcmBdsqd.setPcmbdsqdname( dto.getPcmbdsqdname() );
        }
        if ( dto.getSqsj() != null ) {
            pcmBdsqd.setSqsj( dto.getSqsj() );
        }
        if ( dto.getPimpersonid() != null ) {
            pcmBdsqd.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getCreateman() != null ) {
            pcmBdsqd.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmBdsqd.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmBdsqd.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getPcmbdsqdid() != null ) {
            pcmBdsqd.setPcmbdsqdid( dto.getPcmbdsqdid() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmBdsqd.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getPimpersonname() != null ) {
            pcmBdsqd.setPimpersonname( dto.getPimpersonname() );
        }

        return pcmBdsqd;
    }

    @Override
    public PcmBdsqdDTO toDto(PcmBdsqd entity) {
        if ( entity == null ) {
            return null;
        }

        PcmBdsqdDTO pcmBdsqdDTO = new PcmBdsqdDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmBdsqdDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmBdsqdDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getBzsm() != null ) {
            pcmBdsqdDTO.setBzsm( entity.getBzsm() );
        }
        if ( entity.getLx() != null ) {
            pcmBdsqdDTO.setLx( entity.getLx() );
        }
        if ( entity.getPcmbdsqdname() != null ) {
            pcmBdsqdDTO.setPcmbdsqdname( entity.getPcmbdsqdname() );
        }
        if ( entity.getSqsj() != null ) {
            pcmBdsqdDTO.setSqsj( entity.getSqsj() );
        }
        if ( entity.getPimpersonid() != null ) {
            pcmBdsqdDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getCreateman() != null ) {
            pcmBdsqdDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmBdsqdDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmBdsqdDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getPcmbdsqdid() != null ) {
            pcmBdsqdDTO.setPcmbdsqdid( entity.getPcmbdsqdid() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmBdsqdDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getPimpersonname() != null ) {
            pcmBdsqdDTO.setPimpersonname( entity.getPimpersonname() );
        }

        return pcmBdsqdDTO;
    }

    @Override
    public List<PcmBdsqd> toDomain(List<PcmBdsqdDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmBdsqd> list = new ArrayList<PcmBdsqd>( dtoList.size() );
        for ( PcmBdsqdDTO pcmBdsqdDTO : dtoList ) {
            list.add( toDomain( pcmBdsqdDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmBdsqdDTO> toDto(List<PcmBdsqd> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmBdsqdDTO> list = new ArrayList<PcmBdsqdDTO>( entityList.size() );
        for ( PcmBdsqd pcmBdsqd : entityList ) {
            list.add( toDto( pcmBdsqd ) );
        }

        return list;
    }
}
