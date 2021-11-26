package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmTxbz;
import cn.ibizlab.ehr.webapi.dto.PcmTxbzDTO;
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
public class PcmTxbzMappingImpl implements PcmTxbzMapping {

    @Override
    public PcmTxbz toDomain(PcmTxbzDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmTxbz pcmTxbz = new PcmTxbz();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmTxbz.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmTxbz.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getXh() != null ) {
            pcmTxbz.setXh( dto.getXh() );
        }
        if ( dto.getXb() != null ) {
            pcmTxbz.setXb( dto.getXb() );
        }
        if ( dto.getTxnl() != null ) {
            pcmTxbz.setTxnl( dto.getTxnl() );
        }
        if ( dto.getPcmtxbzname() != null ) {
            pcmTxbz.setPcmtxbzname( dto.getPcmtxbzname() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmTxbz.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getPcmtxbzid() != null ) {
            pcmTxbz.setPcmtxbzid( dto.getPcmtxbzid() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmTxbz.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            pcmTxbz.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmTxbz.setCreatedate( dto.getCreatedate() );
        }

        return pcmTxbz;
    }

    @Override
    public PcmTxbzDTO toDto(PcmTxbz entity) {
        if ( entity == null ) {
            return null;
        }

        PcmTxbzDTO pcmTxbzDTO = new PcmTxbzDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmTxbzDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmTxbzDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getXh() != null ) {
            pcmTxbzDTO.setXh( entity.getXh() );
        }
        if ( entity.getXb() != null ) {
            pcmTxbzDTO.setXb( entity.getXb() );
        }
        if ( entity.getTxnl() != null ) {
            pcmTxbzDTO.setTxnl( entity.getTxnl() );
        }
        if ( entity.getPcmtxbzname() != null ) {
            pcmTxbzDTO.setPcmtxbzname( entity.getPcmtxbzname() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmTxbzDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getPcmtxbzid() != null ) {
            pcmTxbzDTO.setPcmtxbzid( entity.getPcmtxbzid() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmTxbzDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            pcmTxbzDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmTxbzDTO.setCreatedate( entity.getCreatedate() );
        }

        return pcmTxbzDTO;
    }

    @Override
    public List<PcmTxbz> toDomain(List<PcmTxbzDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmTxbz> list = new ArrayList<PcmTxbz>( dtoList.size() );
        for ( PcmTxbzDTO pcmTxbzDTO : dtoList ) {
            list.add( toDomain( pcmTxbzDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmTxbzDTO> toDto(List<PcmTxbz> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmTxbzDTO> list = new ArrayList<PcmTxbzDTO>( entityList.size() );
        for ( PcmTxbz pcmTxbz : entityList ) {
            list.add( toDto( pcmTxbz ) );
        }

        return list;
    }
}
