package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PcmDetail;
import cn.ibizlab.ehr.webapi.dto.PcmDetailDTO;
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
public class PcmDetailMappingImpl implements PcmDetailMapping {

    @Override
    public PcmDetail toDomain(PcmDetailDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmDetail pcmDetail = new PcmDetail();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmDetail.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmDetail.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getLxdh() != null ) {
            pcmDetail.setLxdh( dto.getLxdh() );
        }
        if ( dto.getCjgzsj() != null ) {
            pcmDetail.setCjgzsj( dto.getCjgzsj() );
        }
        if ( dto.getZgxlsxzy() != null ) {
            pcmDetail.setZgxlsxzy( dto.getZgxlsxzy() );
        }
        if ( dto.getZjhm() != null ) {
            pcmDetail.setZjhm( dto.getZjhm() );
        }
        if ( dto.getSfzckjs() != null ) {
            pcmDetail.setSfzckjs( dto.getSfzckjs() );
        }
        if ( dto.getHyzk() != null ) {
            pcmDetail.setHyzk( dto.getHyzk() );
        }
        if ( dto.getZgxlbyyx() != null ) {
            pcmDetail.setZgxlbyyx( dto.getZgxlbyyx() );
        }
        if ( dto.getFirsteducation() != null ) {
            pcmDetail.setFirsteducation( dto.getFirsteducation() );
        }
        if ( dto.getQsrq() != null ) {
            pcmDetail.setQsrq( dto.getQsrq() );
        }
        if ( dto.getZgxxlb() != null ) {
            pcmDetail.setZgxxlb( dto.getZgxxlb() );
        }
        if ( dto.getHtsyq() != null ) {
            pcmDetail.setHtsyq( dto.getHtsyq() );
        }
        if ( dto.getDyxlbyyx() != null ) {
            pcmDetail.setDyxlbyyx( dto.getDyxlbyyx() );
        }
        if ( dto.getCsrq() != null ) {
            pcmDetail.setCsrq( dto.getCsrq() );
        }
        if ( dto.getSbcjd() != null ) {
            pcmDetail.setSbcjd( dto.getSbcjd() );
        }
        if ( dto.getDyxl() != null ) {
            pcmDetail.setDyxl( dto.getDyxl() );
        }
        if ( dto.getDyxlsxzy() != null ) {
            pcmDetail.setDyxlsxzy( dto.getDyxlsxzy() );
        }
        if ( dto.getZgxljssj() != null ) {
            pcmDetail.setZgxljssj( dto.getZgxljssj() );
        }
        if ( dto.getDbdwsj() != null ) {
            pcmDetail.setDbdwsj( dto.getDbdwsj() );
        }
        if ( dto.getGw() != null ) {
            pcmDetail.setGw( dto.getGw() );
        }
        if ( dto.getPimpersonname() != null ) {
            pcmDetail.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getGwtype() != null ) {
            pcmDetail.setGwtype( dto.getGwtype() );
        }
        if ( dto.getRdsj() != null ) {
            pcmDetail.setRdsj( dto.getRdsj() );
        }
        if ( dto.getXxlb() != null ) {
            pcmDetail.setXxlb( dto.getXxlb() );
        }
        if ( dto.getYgbh() != null ) {
            pcmDetail.setYgbh( dto.getYgbh() );
        }
        if ( dto.getBz() != null ) {
            pcmDetail.setBz( dto.getBz() );
        }
        if ( dto.getPx() != null ) {
            pcmDetail.setPx( dto.getPx() );
        }
        if ( dto.getJsrq() != null ) {
            pcmDetail.setJsrq( dto.getJsrq() );
        }
        if ( dto.getContracttype() != null ) {
            pcmDetail.setContracttype( dto.getContracttype() );
        }
        if ( dto.getPimqualtypename() != null ) {
            pcmDetail.setPimqualtypename( dto.getPimqualtypename() );
        }
        if ( dto.getXllx() != null ) {
            pcmDetail.setXllx( dto.getXllx() );
        }
        if ( dto.getCareername() != null ) {
            pcmDetail.setCareername( dto.getCareername() );
        }
        if ( dto.getZgxllx() != null ) {
            pcmDetail.setZgxllx( dto.getZgxllx() );
        }
        if ( dto.getTozjdate() != null ) {
            pcmDetail.setTozjdate( dto.getTozjdate() );
        }
        if ( dto.getJxkhcj() != null ) {
            pcmDetail.setJxkhcj( dto.getJxkhcj() );
        }
        if ( dto.getDyxljssj() != null ) {
            pcmDetail.setDyxljssj( dto.getDyxljssj() );
        }
        if ( dto.getYglx() != null ) {
            pcmDetail.setYglx( dto.getYglx() );
        }
        if ( dto.getPcmdetailname() != null ) {
            pcmDetail.setPcmdetailname( dto.getPcmdetailname() );
        }
        if ( dto.getDzjbjsj() != null ) {
            pcmDetail.setDzjbjsj( dto.getDzjbjsj() );
        }
        if ( dto.getZzmm() != null ) {
            pcmDetail.setZzmm( dto.getZzmm() );
        }
        if ( dto.getKstgkms() != null ) {
            pcmDetail.setKstgkms( dto.getKstgkms() );
        }
        if ( dto.getZgzsbh() != null ) {
            pcmDetail.setZgzsbh( dto.getZgzsbh() );
        }
        if ( dto.getRzqd() != null ) {
            pcmDetail.setRzqd( dto.getRzqd() );
        }
        if ( dto.getPimvocationalcatalogname() != null ) {
            pcmDetail.setPimvocationalcatalogname( dto.getPimvocationalcatalogname() );
        }
        if ( dto.getRank() != null ) {
            pcmDetail.setRank( dto.getRank() );
        }
        if ( dto.getZcbh() != null ) {
            pcmDetail.setZcbh( dto.getZcbh() );
        }
        if ( dto.getPimmajorsetypename() != null ) {
            pcmDetail.setPimmajorsetypename( dto.getPimmajorsetypename() );
        }
        if ( dto.getZjxtgznx() != null ) {
            pcmDetail.setZjxtgznx( dto.getZjxtgznx() );
        }
        if ( dto.getGznx() != null ) {
            pcmDetail.setGznx( dto.getGznx() );
        }
        if ( dto.getXb() != null ) {
            pcmDetail.setXb( dto.getXb() );
        }
        if ( dto.getHtlb() != null ) {
            pcmDetail.setHtlb( dto.getHtlb() );
        }
        if ( dto.getOrmorgname() != null ) {
            pcmDetail.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getZgxl() != null ) {
            pcmDetail.setZgxl( dto.getZgxl() );
        }
        if ( dto.getBjgznx() != null ) {
            pcmDetail.setBjgznx( dto.getBjgznx() );
        }
        if ( dto.getJg() != null ) {
            pcmDetail.setJg( dto.getJg() );
        }
        if ( dto.getHjdz() != null ) {
            pcmDetail.setHjdz( dto.getHjdz() );
        }
        if ( dto.getBdwgznx() != null ) {
            pcmDetail.setBdwgznx( dto.getBdwgznx() );
        }
        if ( dto.getHtqx() != null ) {
            pcmDetail.setHtqx( dto.getHtqx() );
        }
        if ( dto.getNj() != null ) {
            pcmDetail.setNj( dto.getNj() );
        }
        if ( dto.getHkxz() != null ) {
            pcmDetail.setHkxz( dto.getHkxz() );
        }
        if ( dto.getZw() != null ) {
            pcmDetail.setZw( dto.getZw() );
        }
        if ( dto.getSfzgxl() != null ) {
            pcmDetail.setSfzgxl( dto.getSfzgxl() );
        }
        if ( dto.getMz() != null ) {
            pcmDetail.setMz( dto.getMz() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            pcmDetail.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getOrmorgid() != null ) {
            pcmDetail.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmDetail.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getPcmdetailid() != null ) {
            pcmDetail.setPcmdetailid( dto.getPcmdetailid() );
        }
        if ( dto.getCreateman() != null ) {
            pcmDetail.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmDetail.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getEnable() != null ) {
            pcmDetail.setEnable( dto.getEnable() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmDetail.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getOrgid() != null ) {
            pcmDetail.setOrgid( dto.getOrgid() );
        }
        if ( dto.getShortname() != null ) {
            pcmDetail.setShortname( dto.getShortname() );
        }
        if ( dto.getZzdzs() != null ) {
            pcmDetail.setZzdzs( dto.getZzdzs() );
        }
        if ( dto.getOrmorgsectorname() != null ) {
            pcmDetail.setOrmorgsectorname( dto.getOrmorgsectorname() );
        }

        return pcmDetail;
    }

    @Override
    public PcmDetailDTO toDto(PcmDetail entity) {
        if ( entity == null ) {
            return null;
        }

        PcmDetailDTO pcmDetailDTO = new PcmDetailDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmDetailDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmDetailDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getLxdh() != null ) {
            pcmDetailDTO.setLxdh( entity.getLxdh() );
        }
        if ( entity.getCjgzsj() != null ) {
            pcmDetailDTO.setCjgzsj( entity.getCjgzsj() );
        }
        if ( entity.getZgxlsxzy() != null ) {
            pcmDetailDTO.setZgxlsxzy( entity.getZgxlsxzy() );
        }
        if ( entity.getZjhm() != null ) {
            pcmDetailDTO.setZjhm( entity.getZjhm() );
        }
        if ( entity.getSfzckjs() != null ) {
            pcmDetailDTO.setSfzckjs( entity.getSfzckjs() );
        }
        if ( entity.getHyzk() != null ) {
            pcmDetailDTO.setHyzk( entity.getHyzk() );
        }
        if ( entity.getZgxlbyyx() != null ) {
            pcmDetailDTO.setZgxlbyyx( entity.getZgxlbyyx() );
        }
        if ( entity.getFirsteducation() != null ) {
            pcmDetailDTO.setFirsteducation( entity.getFirsteducation() );
        }
        if ( entity.getQsrq() != null ) {
            pcmDetailDTO.setQsrq( entity.getQsrq() );
        }
        if ( entity.getZgxxlb() != null ) {
            pcmDetailDTO.setZgxxlb( entity.getZgxxlb() );
        }
        if ( entity.getHtsyq() != null ) {
            pcmDetailDTO.setHtsyq( entity.getHtsyq() );
        }
        if ( entity.getDyxlbyyx() != null ) {
            pcmDetailDTO.setDyxlbyyx( entity.getDyxlbyyx() );
        }
        if ( entity.getCsrq() != null ) {
            pcmDetailDTO.setCsrq( entity.getCsrq() );
        }
        if ( entity.getSbcjd() != null ) {
            pcmDetailDTO.setSbcjd( entity.getSbcjd() );
        }
        if ( entity.getDyxl() != null ) {
            pcmDetailDTO.setDyxl( entity.getDyxl() );
        }
        if ( entity.getDyxlsxzy() != null ) {
            pcmDetailDTO.setDyxlsxzy( entity.getDyxlsxzy() );
        }
        if ( entity.getZgxljssj() != null ) {
            pcmDetailDTO.setZgxljssj( entity.getZgxljssj() );
        }
        if ( entity.getDbdwsj() != null ) {
            pcmDetailDTO.setDbdwsj( entity.getDbdwsj() );
        }
        if ( entity.getGw() != null ) {
            pcmDetailDTO.setGw( entity.getGw() );
        }
        if ( entity.getPimpersonname() != null ) {
            pcmDetailDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getGwtype() != null ) {
            pcmDetailDTO.setGwtype( entity.getGwtype() );
        }
        if ( entity.getRdsj() != null ) {
            pcmDetailDTO.setRdsj( entity.getRdsj() );
        }
        if ( entity.getXxlb() != null ) {
            pcmDetailDTO.setXxlb( entity.getXxlb() );
        }
        if ( entity.getYgbh() != null ) {
            pcmDetailDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getBz() != null ) {
            pcmDetailDTO.setBz( entity.getBz() );
        }
        if ( entity.getPx() != null ) {
            pcmDetailDTO.setPx( entity.getPx() );
        }
        if ( entity.getJsrq() != null ) {
            pcmDetailDTO.setJsrq( entity.getJsrq() );
        }
        if ( entity.getContracttype() != null ) {
            pcmDetailDTO.setContracttype( entity.getContracttype() );
        }
        if ( entity.getPimqualtypename() != null ) {
            pcmDetailDTO.setPimqualtypename( entity.getPimqualtypename() );
        }
        if ( entity.getXllx() != null ) {
            pcmDetailDTO.setXllx( entity.getXllx() );
        }
        if ( entity.getCareername() != null ) {
            pcmDetailDTO.setCareername( entity.getCareername() );
        }
        if ( entity.getZgxllx() != null ) {
            pcmDetailDTO.setZgxllx( entity.getZgxllx() );
        }
        if ( entity.getTozjdate() != null ) {
            pcmDetailDTO.setTozjdate( entity.getTozjdate() );
        }
        if ( entity.getJxkhcj() != null ) {
            pcmDetailDTO.setJxkhcj( entity.getJxkhcj() );
        }
        if ( entity.getDyxljssj() != null ) {
            pcmDetailDTO.setDyxljssj( entity.getDyxljssj() );
        }
        if ( entity.getYglx() != null ) {
            pcmDetailDTO.setYglx( entity.getYglx() );
        }
        if ( entity.getPcmdetailname() != null ) {
            pcmDetailDTO.setPcmdetailname( entity.getPcmdetailname() );
        }
        if ( entity.getDzjbjsj() != null ) {
            pcmDetailDTO.setDzjbjsj( entity.getDzjbjsj() );
        }
        if ( entity.getZzmm() != null ) {
            pcmDetailDTO.setZzmm( entity.getZzmm() );
        }
        if ( entity.getKstgkms() != null ) {
            pcmDetailDTO.setKstgkms( entity.getKstgkms() );
        }
        if ( entity.getZgzsbh() != null ) {
            pcmDetailDTO.setZgzsbh( entity.getZgzsbh() );
        }
        if ( entity.getRzqd() != null ) {
            pcmDetailDTO.setRzqd( entity.getRzqd() );
        }
        if ( entity.getPimvocationalcatalogname() != null ) {
            pcmDetailDTO.setPimvocationalcatalogname( entity.getPimvocationalcatalogname() );
        }
        if ( entity.getRank() != null ) {
            pcmDetailDTO.setRank( entity.getRank() );
        }
        if ( entity.getZcbh() != null ) {
            pcmDetailDTO.setZcbh( entity.getZcbh() );
        }
        if ( entity.getPimmajorsetypename() != null ) {
            pcmDetailDTO.setPimmajorsetypename( entity.getPimmajorsetypename() );
        }
        if ( entity.getZjxtgznx() != null ) {
            pcmDetailDTO.setZjxtgznx( entity.getZjxtgznx() );
        }
        if ( entity.getGznx() != null ) {
            pcmDetailDTO.setGznx( entity.getGznx() );
        }
        if ( entity.getXb() != null ) {
            pcmDetailDTO.setXb( entity.getXb() );
        }
        if ( entity.getHtlb() != null ) {
            pcmDetailDTO.setHtlb( entity.getHtlb() );
        }
        if ( entity.getOrmorgname() != null ) {
            pcmDetailDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getZgxl() != null ) {
            pcmDetailDTO.setZgxl( entity.getZgxl() );
        }
        if ( entity.getBjgznx() != null ) {
            pcmDetailDTO.setBjgznx( entity.getBjgznx() );
        }
        if ( entity.getJg() != null ) {
            pcmDetailDTO.setJg( entity.getJg() );
        }
        if ( entity.getHjdz() != null ) {
            pcmDetailDTO.setHjdz( entity.getHjdz() );
        }
        if ( entity.getBdwgznx() != null ) {
            pcmDetailDTO.setBdwgznx( entity.getBdwgznx() );
        }
        if ( entity.getHtqx() != null ) {
            pcmDetailDTO.setHtqx( entity.getHtqx() );
        }
        if ( entity.getNj() != null ) {
            pcmDetailDTO.setNj( entity.getNj() );
        }
        if ( entity.getHkxz() != null ) {
            pcmDetailDTO.setHkxz( entity.getHkxz() );
        }
        if ( entity.getZw() != null ) {
            pcmDetailDTO.setZw( entity.getZw() );
        }
        if ( entity.getSfzgxl() != null ) {
            pcmDetailDTO.setSfzgxl( entity.getSfzgxl() );
        }
        if ( entity.getMz() != null ) {
            pcmDetailDTO.setMz( entity.getMz() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            pcmDetailDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getOrmorgid() != null ) {
            pcmDetailDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmDetailDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getPcmdetailid() != null ) {
            pcmDetailDTO.setPcmdetailid( entity.getPcmdetailid() );
        }
        if ( entity.getCreateman() != null ) {
            pcmDetailDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmDetailDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getEnable() != null ) {
            pcmDetailDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmDetailDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getOrgid() != null ) {
            pcmDetailDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getShortname() != null ) {
            pcmDetailDTO.setShortname( entity.getShortname() );
        }
        if ( entity.getZzdzs() != null ) {
            pcmDetailDTO.setZzdzs( entity.getZzdzs() );
        }
        if ( entity.getOrmorgsectorname() != null ) {
            pcmDetailDTO.setOrmorgsectorname( entity.getOrmorgsectorname() );
        }

        return pcmDetailDTO;
    }

    @Override
    public List<PcmDetail> toDomain(List<PcmDetailDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmDetail> list = new ArrayList<PcmDetail>( dtoList.size() );
        for ( PcmDetailDTO pcmDetailDTO : dtoList ) {
            list.add( toDomain( pcmDetailDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmDetailDTO> toDto(List<PcmDetail> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmDetailDTO> list = new ArrayList<PcmDetailDTO>( entityList.size() );
        for ( PcmDetail pcmDetail : entityList ) {
            list.add( toDto( pcmDetail ) );
        }

        return list;
    }
}
